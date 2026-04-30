package test;

import java.util.Scanner;

/* [요구사항]
   100부터 999까지의 숫자(3자리수)를 입력 받아 각 자리의 수를 합한 합계를 출력하는
   프로그램을 작성하시오.
 */

public class Example4 {
    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);

        System.out.println("세자리수의 각 자리의 수의 합계를 구하는 프로그램 입니다.");
        System.out.print("100~999 사이의 세자리수를 입력해주세요 : ");
        num = input.nextInt();

        System.out.println("------------------------------------------------");
        System.out.print("각자리 수의 합은 : ");

        int hundred = num/100;
        int ten = (num/10)%10;
        int one = num%10;

        System.out.print(hundred + " + " + ten + " + " + one + " = ");
        System.out.print((hundred + ten + one) + "입니다.");

        input.close();

    }
}
