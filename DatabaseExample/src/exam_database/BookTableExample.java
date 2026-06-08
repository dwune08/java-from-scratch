package exam_database;

import java.sql.*;
import java.util.Scanner;

public class BookTableExample {
    private static Scanner scanner = new Scanner(System.in);

    // 데이터베이스 접근 시 필요한 데이터
    private static final String serviceName = "XEPDB1";
    private static final String user = "javauser";
    private static final String password = "java1234";

    private static void showMenu() {
        String menu = """
                선택하세요 ...
                1. 데이터 입력
                2. 데이터 조회
                3. 데이터 삭제
                4. 프로그램 종료
                """;
        System.out.println(menu);
        System.out.print("선택: ");
    }
    public static void main(String[] args) {
        int choice;

        while (true) {
            try {
                showMenu();
                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1 -> addBook();
                    case 2 -> readBook();
                    case 3 -> deleteBook();
                    case 4 -> {
                        System.out.println("프로그램을 종료합니다.");
                        scanner.close();
                        return;
                    }
                    default -> System.out.println("잘못된 메뉴 번호입니다.\n");
                }
            } catch(NumberFormatException e){
                System.out.println("[o= ERROR]");
                System.out.println("순자는 몰바른 정수 형식으로 입력해야 합니다.\n");
            } catch(IllegalArgumentException e){
                System.out.println("[o= ERROR]");
                System.out.println("출간일은 YYYY-MM-DD 형식으로 입력해야 합니다.\n");
            }catch(ClassNotFoundException e){
                System.err.println("[드라이버 ERROR] 드라이버를 찾을 수 없습니다.");
            } catch(SQLException e){
                System.err.println("[2|= ERROR] \n" + e.getMessage());
            }
        }
    }
    private static void addBook() throws ClassNotFoundException, SQLException, IllegalArgumentException {
        int price;
        String title, author, publisher;
        Date publishDate;

        System.out.println("[도서 정보 입력]");
        System.out.print("책이름 입력: ");
        title = scanner.nextLine();

        System.out.print("저자 입력: ");
        author = scanner.nextLine();

        System.out.print("출판사 입력: ");
        publisher = scanner.nextLine();

        if (title.isBlank() || author.isBlank() || publisher.isBlank()) {
            System.out.println("[입력 ERROR] 책이름, 저자, 출판사는 반드시 입력해야 합니다.\n");
            return;
        }

        System.out.print("출간일 입력(YYYY-MM-DD): ");
        publishDate = Date.valueOf(scanner.nextLine());

        System.out.print("가격 입력: ");
        price = Integer.parseInt(scanner.nextLine());

        String sql = """
            INSERT INTO book (title, author, publisher, publish_date, price)
            VALUES (?, ?, ?, ?, ?)
        """;
        try (
                Connection conn = DBConnectionUtil.getConnection(serviceName, user, password);
                PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {
            pstmt.setString(1, title);

            pstmt.setString(2, author);
            pstmt.setString(3, publisher);
            pstmt.setDate(4, publishDate);
            pstmt.setInt(5, price);

            int insertCount = pstmt.executeUpdate();

            System.out.println(insertCount == 1 ? "레코드 추가 성공" : "레코드 추가 실패");
            System.out.println();
        }
    }
    private static void readBook()
            throws ClassNotFoundException, SQLException{
        int bookId, price;
        String title, author, publisher, publishDate;

        String sql = """
                SELECT book_id, title, author, publisher,
                       TO_CHAR(publish_date, 'YYYY.MM.DD') AS publish_date,
                       price
                FROM book
                ORDER BY book_id
                """;
        try (
                Connection conn = DBConnectionUtil.getConnection(serviceName, user, password);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
        ) {
            System.out.println("**** book 테이블 데이터 조회 ****");
            System.out.println("-".repeat(100));
            System.out.printf("%s\t%-23s\t\t%-15s\t%-10s\t%-9s\t%s\n", "책번호", "책제목", "저자", "출판사", "출간일", "책가격");

            while(rs.next()) {
                bookId = rs.getInt("book_id");
                title = rs.getString("title");
                author = rs.getString("author");
                publisher = rs.getString("publisher");
                publishDate = rs.getString("publish_date");
                price = rs.getInt("price");

                System.out.printf("%5d\t%-23s\t%-15s\t%-10s\t%-10s\t%d\n", bookId, title, author, publisher, publishDate, price);
            }
            System.out.println("-".repeat(100) + "\n");
        }
    }
    private static void deleteBook()
            throws ClassNotFoundException, SQLException {

        System.out.println("[도서 정보 입력]");
        System.out.print("삭제할 책번호 입력: ");
        int bookNum = Integer.parseInt(scanner.nextLine());

        String sql = """
            DELETE FROM book
            WHERE book_id = ?
        """;
        try (
                Connection conn = DBConnectionUtil.getConnection(serviceName, user, password);
                PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {
            pstmt.setInt(1,bookNum);

            int deleteCount = pstmt.executeUpdate();

            System.out.println(deleteCount == 1 ? "레코드 삭제 성공" : "해당 책번호가 존재하지 않습니다.");
            System.out.println();
        }
    }
}