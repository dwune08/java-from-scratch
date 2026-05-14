package exam_mutator_accessor;
import java.util.Scanner;

public class BookTest {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Book bk = new Book();
        char yn;

        System.out.println("책 정보 출력 프로그램 입니다.");

        System.out.print("데이터를 직접 입력하시겠습니까?(y/n)");
        while(true) {
            yn = input.next().charAt(0);
            input.nextLine();
            if (yn == 'y' || yn == 'n') break;
            else System.out.println("잘못 입력하셨습니다.");
        }
        if(yn == 'y') {
            inputData(bk);
        } else {
            bk.setTitle("주술회전 1권");
            bk.setPrice(7500);
        }
        System.out.printf(bk.toString());
        input.close();
    }

    public static void inputData(Book book) {
        System.out.print("책의 제목을 입력해주세요. ");
        book.setTitle(input.nextLine());
        System.out.print("책의 가격을 입력해주세요. ");
        book.setPrice(input.nextInt());
        input.nextLine();
    }
}