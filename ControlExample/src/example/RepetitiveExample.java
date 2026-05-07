package example;
import java.util.Scanner;

/* [요구사항 2]
 * 메뉴에 있는 연산자를 선택하고 피연산자 두 개를 입력받아
 * 사칙연산을 하는 프로그램의 코드를 작성하여라.
 *
 * [조건]
 * 1. 메뉴에서 1~5사이가 아니면 다시 입력
 * 2. 종료가 선택될 때까지 반복
 * 3. 나눗셈의 결과는 소수 첫번째 자리까지로 표현
 *
 * [실행 예]
 * 연산자를 1~4으로, 종료는 5를 선택해 주세요.
 * 1.+
 * 2.-
 * 3.*
 * 4./
 * 5. 종료
 * 선택>>
 * 1
 * 사칙연산을 할 두 수를 입력하세요:1 4
 * 1 + 4 = 5
 *
 *
 */
public class RepetitiveExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int operator, result;

        System.out.println("연산자를 1~4으로, 종료는 5를 선택해 주세요.");

        do { // 우선 실행해야하니 do~while문 사용
            System.out.println("1.+\n2.-\n3.*\n4./\n5. 종료");
            System.out.println("선택>>");
            operator = input.nextInt();
            if(operator >= 1 && operator <= 4) { // 1,2,3,4인 경우만
                System.out.print("사칙연산을 할 두 수를 입력하세요 : ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                switch(operator) {
                    case 1 -> System.out.printf("%d + %d = %d\n", num1, num2, num1+num2);
                    case 2 -> System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);
                    case 3 -> System.out.printf("%d * %d = %d\n", num1, num2, num1*num2);
                    case 4 -> System.out.printf("%d / %d = %.1f\n", num1, num2, (double)num1/num2);
                    // 나누셈의 경우 소수 1자리까지 출력.
                    // 분모가 0인 경우는 출력예시에 없어서 생략.
                }
            }
        } while(operator != 5); // 5가 입력된 경우 종료
        System.out.println("프로그램을 종료합니다.");
        input.close();
    }
}
