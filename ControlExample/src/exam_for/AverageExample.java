package exam_for;

import java.util.Scanner;

/* 10개의 숫자를 입력 받아 0보다 큰 숫자에 대한 평균과 개수를 출력하는 코드를 완성하시오. */

public class AverageExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0, sum = 0;

        System.out.println("10개의 숫자를 차례로 입력해주세요.");
        for(int i = 0; i < 10; i++) {
            System.out.printf("%2d번째 > ", (i+1));
            int j = input.nextInt();
            if(j > 0) {
                count++;
                sum += j;
            }
        }
        if(count == 0) System.out.println("입력된 값 중 유효한 숫자가 없습니다.");
        else System.out.println("평균 : " + ((double)sum/count) + " 개수 : " + count);
    }
}
