package exam_class_basic;
import java.util.Scanner;

public class BookTest {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Book book1 = new Book();
        /*
        book1.bookNumber="S000000781116";
        book1.bookName = "작별하지 않는다";
        book1.bookPublisher = "문학동네";
        book1.bookPrice = 16800;
        */

        dataInput(book1);

        // 필드에 직접 접근하여 출력
        String printData = """
        책번호: %s
        책이름: %s
        출판사명: %s
        책가격: %,d원
        """.formatted(book1.bookNumber, book1.bookName, book1.bookPublisher, book1.bookPrice);
        System.out.println(printData);
        System.out.println();

        Book book2 = new Book();
        /*
        book2.bookData("S000000610612", "소년이 온다", "창비", 15000);
        */

        dataInput(book2);

        System.out.println(book2.toString());
    }
    public static void dataInput(Book bk) {
        System.out.print("책 번호를 입력하세요. ");
        bk.bookNumber = input.nextLine();
        System.out.print("책 제목을 입력하세요. ");
        bk.bookName = input.nextLine();
        System.out.print("출판사를 입력하세요. ");
        bk.bookPublisher = input.nextLine();
        System.out.print("가격을 입력하세요. ");
        bk.bookPrice = input.nextInt();
        input.nextLine();
    }

}
