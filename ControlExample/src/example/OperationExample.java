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
        int result = 0;
        char ch;

        Scanner input = new Scanner(System.in);

        System.out.println("*** 계산기 프로그램 입니다. ***");

        do {
            System.out.println("연산자를 입력해주세요.(+,-,*,/)");
            ch = input.next().charAt(0);
        } while(ch!='+' && ch!='-' && ch!='*' && ch!='/');
        // 잘못된 연산자를 입력한 경우 다시 입력받음

        System.out.println("두 수를 입력해주세요.");
        int x = input.nextInt();
        int y = input.nextInt();

        switch(ch) { // 연산자 별로 결과를 result에 저장
            case '+' -> result = x+y;
            case '-' -> result = x-y;
            case '*' -> result = x*y;
            case '/' -> {
                if(y ==0) { // 분모가 0인 경우 처리
                    System.out.println("분모는 0이 될 수 없습니다.");
                } else { // 나누기의 경우 결과가 실수로 나올 수 있어 따로 출력
                    System.out.println("계산 결과는");
                    System.out.println(x + " " + ch + " " + y +" = " + (double)x/y);
                }
                return; // 뒤에 출력문이 다시 나오지 않도록 return 처리
            }
        }
        System.out.println("계산 결과는");
        System.out.println(x + " " + ch + " " + y + " = " + result);

        input.close();
    }
}
