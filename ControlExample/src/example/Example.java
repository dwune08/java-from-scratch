package example;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        System.out.println("*** 덧셈으로 곱셈하기 ***");
        System.out.print("곱하고 싶은 숫자 둘을 공백을 기준으로 입력해주세요.");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if(num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        } // 입력받은 두 수의 크기를 비교해 num1에 작은 수를, num2에 큰 수를 넣어준다.

        for(int i = 1; i <= num2; i++) { // num1 을 num2번 더하는 루프
            System.out.print(num1);
            if(i < num2) System.out.print(" + "); // 마지막에는 +가 붙지 않도록
            sum += num1;
        }
        System.out.println(" = " + sum);

        sum = 0;
        for(int i = 1; i <= num1; i++) { // num2 을 num1번 더하는 루프
            System.out.print(num2);
            if(i < num1) System.out.print(" + "); // 마지막에는 +가 붙지 않도록
            sum += num2;
        }
        System.out.println(" = " + sum);
        input.close();
    }
}
