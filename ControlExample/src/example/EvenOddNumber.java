package example;
import java.util.Scanner;

/* [요구사항 1]
 * 두 개의 정수를 입력받아 두 수 사이에 포함되는 모든 정수들 중에서
 * 홀수의 합과 짝수의 합을 각각 출력하는 프로그램을 작성하시오.
 * 단, 두 수는 어떤 순서로 입력되어도 정상적으로 처리되어야 한다.
 *
 * [실행 예]
 * 두 수를 공백을 기준으로 입력해 주세요3 10
 * 3부터 10까지의 홀수의 합: 24
 * 3부터 10까지의 짝수의 합: 28 */

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int oddSum = 0, evenSum = 0;

        System.out.print("두 수를 공백을 기준으로 입력해 주세요");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if(num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        } // 입력받은 두 수의 크기를 비교해 num1에 작은 수를, num2에 큰 수를 넣어준다.

        for(int k = num1; k <= num2; k++) { // num1 부터 num2까지 k를 1씩 증가시키며 반복
            if(k % 2 == 0) evenSum += k; // k가 짝수인 경우 evenSum에 더해준다.
            else oddSum += k;            // K가 홀수인 경우 oddSum에 더해준다.
        }

        System.out.println(num1 + "부터 " + num2 +"까지의 홀수의 합: " + oddSum);
        System.out.println(num1 + "부터 " + num2 +"까지의 짝수의 합: " +  evenSum);

        input.close();
    }
}
