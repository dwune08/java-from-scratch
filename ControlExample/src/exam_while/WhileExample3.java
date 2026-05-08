package exam_while;
import java.util.Scanner;

/* 사용자로부터 한 개의 값을 입력 받아
 * 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
 * 단, 입력한 수는 1보다 크거나 같아야 한다.
 * 만약 1 미만의 숫자가 입력됐다면
 * "잘못 입력하셨습니다. 다시 입력해주세요."가 출력되면서
 * 다시 사용자가 값을 입력하도록 하세요.  */

public class WhileExample3 {
    public static void main(String[] args) {
        int i;
        Scanner input = new Scanner(System.in);

        System.out.println("입력받은 값부터 1까지 역순으로 출력하는 프로그램입니다.");
        System.out.print("1보다 큰 정수를 입력해주세요. ");
        while((i = input.nextInt()) < 1) {
            System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            System.out.print("1보다 큰 정수를 입력해주세요. ");
        }
        while(i >= 1) {
            System.out.print(i-- + " ");
        }
        input.close();
    }
}
