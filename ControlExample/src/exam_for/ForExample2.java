package exam_for;

import java.util.Scanner;

// 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.

public class ForExample2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, num;

        System.out.println("1부터 입력받은 수까지 더하는 프로그램입니다.");
        do {
            System.out.print("1 이상의 정수를 입력해주세요. ");
            num = input.nextInt();
        } while(num < 1);

        for(int i = 1; i <= num; i++) {
            System.out.print(i);
            if(i < num) System.out.print(" + ");
            sum += i;
        }
        System.out.print(" = " + sum);
        input.close();
    }
}
