package exm_tableselect;

import exam_database.DBConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectBookOrderTest {
    public static void main(String[] args) {
        String orderId, orderDate;
        int memberId, bookId, orderQuantity;

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        String sql = """
                SELECT order_id, member_id, book_id, order_quantity, TO_CHAR(order_date, 'YYYY/MM/DD') as order_date
                FROM book_order
                """;

        try  {
            conn = DBConnectionUtil.getConnection("XE", "hr", "hr1234");
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            System.out.println("**** BOOK_ORDER 테이블 데이터 출력 ****\n");
            System.out.printf("%s\t%12s\t%s\t%s\t%s\n", "주문번호", "회원번호", "도서코드", "주문권수", "주문일자");

            while(rs.next()) {
                orderId = rs.getString("order_id");
                memberId = rs.getInt("member_id");
                bookId = rs.getInt("book_id");
                orderQuantity = rs.getInt("order_quantity");
                orderDate = rs.getString("order_date");

                System.out.printf("%s %7d %7d %7d %s\n", orderId, memberId, bookId, orderQuantity, orderDate);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("[드라이버 ERROR] 드라이버를 찾을 수 없습니다.");
        } catch (SQLException e) {
            System.out.println("[DB ERROR] 데이터베이스 작업 중 오류가 발생했습니다.");
            System.out.println(e.getMessage());
        } finally {
            try {
                if(conn != null) conn.close();
                if(stmt != null) stmt.close();
                if(rs != null) rs.close();
            } catch  (Exception e) {
                System.err.println("[Close ERROR] \n" + e.getMessage());
            }
        }
    }
}
