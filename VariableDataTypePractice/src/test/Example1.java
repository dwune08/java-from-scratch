package test;

import java.util.Scanner;

/* [요구사항]
    국어, 영어, 수학 점수를 입력받아, 총점과 평균(소수 첫번째 자리)을 구해
    출력하는 프로그램을 작성하시오.
 */

public class Example1 {
    public static void main(String[] args) {
        int koreanScore, englishScore, mathScore;


        Scanner input = new Scanner(System.in);

        System.out.println("총점과 평균을 구하는 프로그램 입니다.");
        System.out.println("각 과목의 점수를 입력하세요.");

        System.out.print("국어 점수 : ");
        koreanScore = input.nextInt();
        System.out.print("영어 점수 : ");
        englishScore = input.nextInt();
        System.out.print("수학 점수 : ");
        mathScore = input.nextInt();

        int sum = koreanScore + englishScore + mathScore;

        System.out.println("------------------------------");
        System.out.println("총점 : " + sum + "점");
        System.out.printf("평균 : %.1f", (sum/3.0));

        input.close();
    }
}
