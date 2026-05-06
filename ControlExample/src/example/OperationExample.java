package example;

/*[요구사항 1]
 * 간단한 계산기 프로그램을 작성하여 보자.
 * 먼저 사용자로부터 2개의 숫자를 입력 받는다.
 * 이어서 사용자로부터 하나의 문자를 입력받는다. (+,*,-,/)
 * 사용자로부터 받은 문자가 '+'이면 두 수의 덧셈을, '-'이면 뺄셈을, ...
 * 나눗셈의 경우, 분모가 0이 아닌지를 먼저 검사하여야 한다.
 */

import java.util.Scanner;

public class OperationExample {
    public static void main(String[] args) {
        double result;
        Scanner input = new Scanner(System.in);

        System.out.println("*** 계산기 프로그램 입니다. ***");
        System.out.println("두 수를 입력해주세요.");
        double x = input.nextInt();
        double y = input.nextInt();

        System.out.println("연산자를 입력해주세요.(+,-,*,/)");
        char ch = input.next().charAt(0);

        switch(ch) {
            case '+' -> result = x+y;
            case '-' -> result = x-y;
            case '*' -> result = x*y;
            case '/' -> {
                if(y ==0) {
                    System.out.println("분모가 0이 되어 계산할 수 없습니다.");
                    return;
                } else {
                    result = x / y;
                }
            }
            default -> {
                System.out.println("잘못 입력하셨습니다.");
                return;
            }
        }
        System.out.println("계산 결과는");
        System.out.println(x + " " + ch + " " + y +" = " + result);
        input.close();
    }
}
