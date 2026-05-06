package exam_if;

import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        int x, y, z;

        Scanner input = new Scanner(System.in);

        System.out.println("**최대값 판별 프로그램**");
        System.out.print("세 개의 정수를 차례로 입력해주세요.");
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();

        if(x > y) {
            if(x > z)
                System.out.println("세 개의 정수 중 최대값은 " + x + "입니다.");
            else
                System.out.println("세 개의 정수 중 최대값은 " + z + "입니다.");
        } else {
            if(y > z)
                System.out.println("세 개의 정수 중 최대값은 " + y + "입니다.");
            else
                System.out.println("세 개의 정수 중 최대값은 " + z + "입니다.");
        }
        /*
            int max;
            if(x > y) {
                if(x > z)
                    max = x;
                else
                    max = z;
            } else {
                if(y > z)
                    max = y;
                else
                    max = z;
            }
            System.out.println("세 개의 정수 중 최대값은 " + max + "입니다.");

        **********************************************
         int max = x;
            if(y > max)
                max = y;
            if(z > max)
                max = z;

            System.out.println("세 개의 정수 중 최대값은 " + max + "입니다.");

        **********************************************

        int max;
            max = Math.max(x, y, z);
            System.out.println("세 개의 정수 중 최대값은 " + max + "입니다.");
        */

        input.close();
    }
}
