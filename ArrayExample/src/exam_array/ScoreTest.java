package exam_array;
import java.util.Scanner;

/* 학생 수를 입력 받고, 그 수(학생수)만큼 점수를 입력받아
 * 평균을 구하도록 프로그램을 작성하여 보자.  */

public class ScoreTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        System.out.print("학생 수를 입력하세요. ");
        int[] score = new int[input.nextInt()];
        System.out.println("학생의 성적을 차례대로 입력해주세요.");
        for(int i = 0; i < score.length; i++) {
            System.out.print((i+1) + "번째 학생의 성적 : ");
            score[i] = input.nextInt();
            sum += score[i];
        }
        System.out.print("평균성적 : " + (double)sum/score.length);
        input.close();
    }
}
