package test;

import java.util.Scanner;

/* [요구사항]
    x개의 사탕을 y명의 학생들에게 똑가팅 나누어주려고 할 때,
    각 학생들이 받을 수 있는 사탕의 수와 남는 사탕의 수를 계산해 출력하는 프로그램
 */

public class Example2 {
    public static void main(String[] args) {
        int candy, student;

        Scanner input = new Scanner(System.in);

        System.out.println("사탕 분배 프로그램 입니다.");
        System.out.println("사탕의 수와 학생 수를 각각 입력해주세요.");
        System.out.print("사탕 개수 : ");
        candy = input.nextInt();
        System.out.print("학생 수 : ");
        student = input.nextInt();

        System.out.println("--------------------------------");
        System.out.println("각 학생들이 받을 사탕 수 : " + (candy/student) + "개");
        System.out.println("남는 사탕 수 : " + (candy%student) + "개");

        input.close();
    }
}
