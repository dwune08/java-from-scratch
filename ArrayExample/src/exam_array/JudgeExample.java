package exam_array;
import java.util.Scanner;

public class JudgeExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] score = new int[5];
        int maxScore = 0, minScore = 0;
        int sum = 0;
        double average;

        for(int i = 0; i < 5; i++) {
            while(true) {
                System.out.print((i + 1) + "번째 심사위원의 점수 : ");
                score[i] = input.nextInt();
                if(score[i] >= 0 && score[i] <= 100) break;
                else System.out.println("0~100 사이의 점수를 입력해주세요.");
            }

            if(minScore > score[i] || i == 0) minScore = score[i];
            if(maxScore < score[i] || i == 0) maxScore = score[i];
            sum += score[i];
        }
        average = (sum - maxScore - minScore)/3.00;
        System.out.print("최대/최소를 제외한 평균 점수 : " + average);
        input.close();
    }
}
