package exam_switch;

import java.util.Scanner;

/* 사용자로 하여금 점수(score)를 입력받아 학점(grade)를 출력하는 프로그램을 작성해 주세요.
        90 ~ 100 A
        80 ~ 89  B
        70 ~ 79  C
        60 ~ 69  D
        59 이하   F
 */
public class SwitchExample2 {
    public static void main(String[] args) {
        int score;

        Scanner input = new Scanner(System.in);
        System.out.print("점수는 0~100 사이로 입력해 주세요.");
        score = input.nextInt();

        char grade = switch (score / 10) {
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';

            //Sytem.out.println("점수가 " + score + "입니다.");
            //Sytem.out.println("학점은 " + grade + "입니다.");
        };
        System.out.printf("점수 = %d, 학점 = %c", score, grade);

        input.close();
    }
}
