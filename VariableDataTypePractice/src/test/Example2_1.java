package test;

import java.util.Scanner;

/* [요구사항]
    달걀의 수를 입력받아 12개씩 담을 수 있는 상자의 수를 삼항 연산자를 이용하여
    실행결과와 같이 출력하도록 프로그램을 작성시오.
 */

public class Example2_1 {
    public static void main(String[] args) {
        int eggs, boxes;

        Scanner input = new Scanner(System.in);

        System.out.println("달걀 박스 수량 계산기 입니다.");
        System.out.println("달걀의 수량을 입력하세요.");
        System.out.print("달걀의 수 : ");
        eggs = input.nextInt();

        boxes = ((eggs%12) == 0 ? (eggs/12) : (eggs/12 + 1));
        System.out.println("------------------------");
        System.out.print("달걀 " + eggs + "개를 12개씩 담을 수 있는 상자의 수는 ");
        System.out.print(boxes + "개입니다.");

        input.close();

    }
}
