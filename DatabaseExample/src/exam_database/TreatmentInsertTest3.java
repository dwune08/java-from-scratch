package exam_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 사용자로부터 진료번호, 진료과목 약어, 진료과목명, 전화번호를 입력받아
 * treatment 테이블에 데이터를 추가하는 예제이다.
 */

public class TreatmentInsertTest3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Connection conn = null;
        PreparedStatement pstmt = null;

        String courseAbbr, course, tel;
        int no;

        try {
            System.out.println("진료번호, 진료과목약어, 진료과목(공백없이), 전화번호(-포함)를 차례로 입력해주세요.");
            no = input.nextInt();
            courseAbbr = input.next();
            course = input.next();
            tel = input.next();

            conn = DBConnectionUtil.getConnection("XE", "hr", "hr1234");

            String query = """
                    INSERT INTO treatment(t_no, t_course_abbr, t_course, t_tel)
                    VALUES (?, ?, ?, ?)
                    """;

            pstmt = conn.prepareStatement(query);

            pstmt.setInt(1, no);
            pstmt.setString(2, courseAbbr);
            pstmt.setString(3, course);
            pstmt.setString(4, tel);

            int insertCount = pstmt.executeUpdate();;

            if(insertCount == 1) {
                System.out.println("레코드 추가 성공");
            } else {
                System.out.println("레코드 추가 실패");
            }


        } catch (InputMismatchException i) {
            System.err.println("[데이터 입력 ERROR] \n" + i.getMessage());
        }catch (ClassNotFoundException e) {
            System.err.println("[드라이버 ERROR] 드라이버를 찾을 수 없습니다.");
        }catch (SQLException e) {
            System.err.println("[쿼리문 ERROR] \n" + e.getMessage());
        } finally {
            try {
                if(pstmt != null) pstmt.close();
                if(conn != null) conn.close();
                if(input != null) input.close();
            } catch (Exception e) {
                System.err.println("[Close ERROR] \n" + e.getMessage());
            }
        }
    }
}
