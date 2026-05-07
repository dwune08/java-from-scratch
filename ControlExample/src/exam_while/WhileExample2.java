package exam_while;
import java.util.Scanner;

/* -1이 입력될 때까지 정수를 입력받아
그 수들의 합을 출력하는 프로그램을 작성하시오. */

public class WhileExample2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0, sum = 0;

        System.out.println("-1이 입력될 때까지 정수를 입력받아\n" +
                "입력받은 정수의 합을 출력하는 프로그램 입니다.");
        do {
            sum += i;
            System.out.print("정수를 입력하세요. ");
        } while ((i = input.nextInt()) != -1);
        System.out.println("입력 받은 정수들의 합 : " + sum);
        input.close();
    }
}
