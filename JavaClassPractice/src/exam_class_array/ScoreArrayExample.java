package exam_class_array;
import java.util.Scanner;

public class ScoreArrayExample {
    public static void main(String[] args) {
        final int STUDENTS = 5;
        int[] scores = new int[STUDENTS];

        // 1. 입력을 위한 메서드 호출 (배열을 인자로 전달)
        getValues(scores);

        // 2. 평균 계산 및 출력을 위한 메서드 호출 (배열을 인자로 전달)
        getAverage(scores);
    }

    public static void getValues(int[] scores) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "번 학생의 컴퓨터 점수를 입력하시오 : ");
            int temp = input.nextInt(); // 임시 변수에 저장하여 검사

            // 0~100 사이인지 확인
            if (temp < 0 || temp > 100) {
                System.out.print("[오류] 점수는 0에서 100 사이여야 합니다. 다시 입력하세요.");
                i--;
                continue;
            }

            scores[i] = temp; // 유효한 경우에만 배열에 저장
        }
        input.close();
    }

    public static void getAverage(int[] scores) {
        int total = 0;
        for(int score : scores) {
            total += score;
        }

        double average = (double) total / scores.length;
        System.out.printf("평균 성적은 %.2f입니다.\n", average);
    }
}
