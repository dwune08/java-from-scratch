package exam_while;
import java.util.Scanner;

/* 사용자로부터 5개의 정수를 읽어서 합과 평균값을
 * 계산하여 출력하는 프로그램을 작성하라.
 *
 * [출력 예시]
 * 1번째 수 입력: 1
 * 2번째 수 입력: 2
 * 3번째 수 입력: 3
 * 4번째 수 입력: 4
 * 5번째 수 입력: 5
 * 입력 받은 수
 * 합계: 15 평균: 3.0 */

public class NumberSum {
    public static void main(String[] args) {
        int i = 0, sum = 0;
        Scanner input = new Scanner(System.in);

        while(i++ < 5) {
            System.out.print(i + "번째 수 입력: ");
            int j = input.nextInt();
            sum += j;
        }

        System.out.println("입력 받은 수");
        System.out.print("합계: " + sum + " 평균: " + (sum/5.0));

        input.close();
    }
}
