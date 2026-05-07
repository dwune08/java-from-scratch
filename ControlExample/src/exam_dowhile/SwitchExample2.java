package exam_dowhile;

import java.util.Scanner;

public class SwitchExample2 {
    public static void main(String[] args) {
        int score;

        Scanner input = new Scanner(System.in);
        do {
            System.out.print("점수는 0~100 사이로 입력해 주세요. ");
            score = input.nextInt();
        } while(score < 0 || score > 100);

        System.out.printf("점수 = %d ", score);

        char grade = switch(score / 10) {
            case 10, 0 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';
        };
        System.out.printf("학점 = %c", grade);
        input.close();
    }
}
