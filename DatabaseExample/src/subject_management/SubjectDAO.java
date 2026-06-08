package subject_management;

import academic_database.DBConnectionUtil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static academic_database.DBConnectionUtil.getConnection;

public class SubjectDAO {
    private static final SubjectDAO instance = new SubjectDAO();
    public static SubjectDAO getInstance() {
        return instance;
    }
    private SubjectDAO() {}


    static Scanner input = new Scanner(System.in);

    private static void create () throws ClassNotFoundException, SQLException, IllegalArgumentException {

        System.out.print("추가할 학과명 입력: ");
        String sName = input.nextLine();

        String sql = """
            INSERT INTO subject (s_name)
            VALUES (?)
        """;

        try (
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {
            pstmt.setString(1, sName);

            int insertCount = pstmt.executeUpdate();

            System.out.println(insertCount == 1 ? "레코드 추가 성공" : "레코드 추가 실패");
            System.out.println();
        }
    }

    private SubjectDTO addSubject(ResultSet rs) throws SQLException {
        SubjectDTO subjectDTO = new SubjectDTO();
        subjectDTO.setNo(rs.getInt("no"));
        subjectDTO.setSubjectNumber(rs.getString("s_num"));
        subjectDTO.setSubjectName(rs.getString("s_name"));
        return subjectDTO;
    }
    public List<SubjectDTO> getAllSubjects() throws SQLException {
        List<SubjectDTO> list = new ArrayList<>();
        String sql = """
        
                SELECT no, s_num, s_name FROM subject
        ORDER BY no
        """;
        try (
                    Connection conn = getConnection();
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    ResultSet rs= pstmt. executeQuery()
        ) {
            while (rs.next()) {
                list.add(addSubject(rs));
            }
        }
        return list;
        }

    private static void update() throws ClassNotFoundException, SQLException, IllegalArgumentException{

    }

    private static void delete() throws ClassNotFoundException, SQLException, IllegalArgumentException{
        System.out.print("삭제할 학과번호 입력: ");
        int sNum = Integer.parseInt(input.nextLine());

        String sql = """
            DELETE FROM subject
            WHERE s_num = ?
        """;
        try (
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {
            pstmt.setInt(1,sNum);

            int deleteCount = pstmt.executeUpdate();

            System.out.println(deleteCount == 1 ? "레코드 삭제 성공" : "해당 책번호가 존재하지 않습니다.");
            System.out.println();
        }
    }
}
