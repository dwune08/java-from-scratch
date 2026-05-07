package exam_break;
import java.util.Scanner;

/* 사용자가 입력한 점수의 총점, 평균을 내는 프로그램을 작성하시오.
 * 단 종료는 0 ~ 100 사이가 아닌 값 입력하면 된다.  */

public class BreakExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalScore = 0, count = 0;

        System.out.println("*** 총점, 평균 계산 프로그램 ***");
        while(true) {
            System.out.print("점수를 입력하세요.(0~100) > ");
            int score = input.nextInt();
            if (score > 100 || score < 0) break;
            totalScore += score;
            count++;
        }
        if(count != 0) {
            System.out.println("총점 : " + totalScore + "\n평균 : " + (double) totalScore / count);
        } else {
            System.out.println("유효한 점수가 입력되지 않았습니다.");
        }
    }
}
