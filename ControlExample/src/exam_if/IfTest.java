package exam_if;

import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
        int x, y;

        Scanner input = new Scanner(System.in);

        System.out.println("두 정수 크기 비교 프로그램");
        System.out.print("두 수를 차례로 입력해주세요.");
        x = input.nextInt();
        y = input.nextInt();

        if(x > y)
            System.out.print("작은 수 : " + y + ", 큰 수 : " + x);
        else
            System.out.print("작은 수 : " + x + ", 큰 수 : " + y);

        /*
        if(x > y) {
           int temp;

           temp = x;
           x = y;
           y = temp;
        }
        System.out.print("작은 수 : " + x + ", 큰 수 : " + y);
        */

        input.close();

    }
}
