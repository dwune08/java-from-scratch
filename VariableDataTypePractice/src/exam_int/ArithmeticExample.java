package exam_int;
// 두 수를 입력받아 사칙연산 결과 출력하기

import java.util.Scanner;

public class ArithmeticExample {
    public static void main(String[] args) {
        int x, y;

        Scanner input = new Scanner(System.in);

        System.out.println("사칙연산 계산기 입니다.");
        System.out.print("첫 번째 숫자를 입력하세요 : ");
        x = input.nextInt();
        System.out.print("두 번째 숫자를 입력하세요 : ");
        y = input.nextInt();
        System.out.println("덧셈 결과 : " + (x+y));
        System.out.println("뺄셈 결과 : " + (x-y));
        System.out.println("곱셈 결과 : " + (x*y));
        System.out.println("나눗셈 결과 : " + (x/y));
        System.out.println("나머지 결과 : " + (x%y));

        input.close();
    }
}
