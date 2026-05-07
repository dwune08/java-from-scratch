package exam_dowhile;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        // [예제1] 선처리 후조건문임을 확인
        int num = 0;
        do {
            System.out.println("num의 값: " + num);
            num++;
        } while(num < 0);

        // [예제2] 1에서부터 10까지 출력
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while(i <= 10);

        System.out.println();

        // [예제3] 10에서부터 1까지 출력
        i = 10;
        do {
            System.out.print(i + " ");
            i--;
        } while(i > 0);

        System.out.println();

        //[예제4] 1에서 100까지의 합을 출력해 주세요.(do~while문을 이용하여)
        int number = 1, sum = 0;
        do {
            sum+= number++;
        } while(number <= 100);

        System.out.print("1에서 100까지의 합 = " + sum);
        System.out.println();

        //[예제5] 사용자에게 문자 및 숫자를 입력 받아서 출력하고자 한다.
        // 이때 종료는 q를 입력하면 된다.

        Scanner scanner = new Scanner(System.in);
        String inputString;
        System.out.println("메시지를 입력하세요");
        System.out.println("프로그램을 종료하려면 \"종료\"를 입력하세요.");

        do {
            System.out.print(">");
            inputString = scanner.nextLine();
            System.out.println(inputString);
        } while(!inputString.equals("종료"));

        System.out.println();
        System.out.print("프로그램 종료합니다.");
        scanner.close();
    }
}
