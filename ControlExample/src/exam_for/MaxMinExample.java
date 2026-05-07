package exam_for;
import java.util.Scanner;

/* 10개의 데이터를 입력받아 최소값, 최대값을 구하여 출력하는 코드를 작성하시오. */

public class MaxMinExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0, min = 0;

        /* int max = Integer.MIN_VALUE;
         * int min = Integer.MAX_VALUE;
         * 이렇게 초기값을 정수형의 최소/최대 한계값으로 설정도 가능          */

        System.out.println("입력받은 수 중 최대값, 최소값을 구하는 프로그램 입니다.");
        for(int i = 0; i < 10; i++) {
            System.out.print("> ");
            int temp = input.nextInt();
            if(i == 0) {
                max = temp;
                min = temp;
            } else {
                if(max < temp) max = temp;
                if(min > temp) min = temp;
            }
        }
        System.out.println("최대값 : " + max + "\n최소값 : " + min);
        input.close();
    }
}
