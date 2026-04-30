package exam_operation;

import java.util.Scanner;

public class ConditionalOeprationExample {
    public static void main(String[] args) {
        int x = 100;
        int y = 200;
        // (조건식) ? 조건식이 참인 경우 실행할 식 : 조건식이 거짓일 경우 실행할 식;
        System.out.println("두 수(100과 200) 중에서 최대값 : " + ((x > y) ? x : y));
        System.out.println("두 수(100과 200) 중에서 최대값 : " + Math.max(x, y));

        /*
        public static int max(int a, int b) {
            return (a >= b) ? a : b;
        }
        */

        // 임의의 수(키보드로 입력받은 값)를 가진 변수를 선언하고
        // 그 값이 짝수인지 홀수인지를 출력할 수 있도록 작성해 주세요.
        // 예를 들어 "4는 짝수입니다."

        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("숫자를 입력해 주세요. ");
        num = input.nextInt();

        System.out.print(num + "는 ");
        System.out.print((num % 2 == 0) ? "짝수" : "홀수");
        System.out.println("입니다.");

        // 두수의 차를 출력해 주세요. 단 큰수에서 작은수를 빼서 결과 출력한다.
        int num1, num2;
        // Scanner input = new Scanner(System.in);
        System.out.print("두수를 공백 단위로 구분하여 입력해 주세요.");
        num1 = input.nextInt();
        num2 = input.nextInt();
        int result = (num1 > num2) ? num1 - num2 : num2 - num1;

        System.out.println("두수의 차 = " + result);
        input.close();
    }
}
