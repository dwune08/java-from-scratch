package example;

/* [요구사항 2]
 * 다음과 같은 조건으로 성적 처리 프로그램을 작성하시오.
 * [조건]
 * 1. 중간고사, 기말고사, 레포트, 출석 점수를 입력받아서 계산한다.
 * 2. 성적은 아래에 준한 점수를 합산하되 소수 이하 2자리까지 출력하라.
 *  a. (중간+기말)/2 -> 60%
 *  b. 레포트 -> 20%
 *  c. 출석-> 20%
 * 3. 학점의 기준(if~else if~else문 이용)
 *  90점이상 'A' / 80이상 'B' / 70이상 'C' / 60이상 'D' / 나머지 'F'
 * 4. 평가기준(switch문이용)
 *  A, B학점 -> "excellent" / C,D 학점 -> "good" / F학점 -> "poor"
 * 5. 출력화면
 * ------ 결과입니다. ------
 * 중간고사: 90
 * 기말고사: 89
 * 레포트: 99
 * 출석점수: 100
 *
 * 성적 : 93.50
 * 학점 : A
 * 평가 : excellent */

import java.util.Scanner;

public class GradePrograming {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char grade;

        System.out.println("*** 성적 처리 프로그램 입니다 ***");
        System.out.println("항목별로 성적을 입력해주세요.");
        System.out.print("중간고사 : ");
        int midScore = input.nextInt();
        System.out.print("기말고사 : ");
        int finScore = input.nextInt();
        System.out.print("레포트 : ");
        int repScore = input.nextInt();
        System.out.print("출석점수 : ");
        int attScore = input.nextInt();

        double totalScore = (midScore+finScore)*0.30 + repScore*0.20 + attScore*0.20;

        if(totalScore >= 90) grade = 'A';
        else if(totalScore >= 80) grade = 'B';
        else if(totalScore >= 70) grade = 'C';
        else if(totalScore >= 60) grade = 'D';
        else grade = 'F';

        String eval = switch(grade) {
            case 'A', 'B' -> "excellent";
            case 'C', 'D' -> "good";
            case 'F' -> "poor";
            default -> "평가오류";
        };

        System.out.println("------ 결과입니다 ------");
        System.out.println("중간고사: " + midScore);
        System.out.println("기말고사: " + finScore);
        System.out.println("레포트: " + repScore);
        System.out.println("출석점수: " + attScore);
        System.out.printf("\n성적 : %.2f\n", totalScore);
        System.out.println("학점 : " + grade);
        System.out.println("평가 : " + eval);

        input.close();
    }
}
