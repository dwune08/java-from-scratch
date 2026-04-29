package exam_int;

/* [요구사항]
   두 변수를 선언하고 임의의 수를 입력받아
   서로 값을 교환하여 출력하는 프로그램을 작성하시오.
*/


import java.util.Scanner;


public class IntExample {
    public static void main(String[] args) {
        int x, y;
        // 정수형 변수 x, y를 선언

        Scanner input = new Scanner(System.in); // Scanner 클래스 소환

        System.out.println("x의 값을 입력해주세요.");   //안내문구
        System.out.print("x = ");
        x = input.nextInt();
        System.out.println("y의 값을 입력해주세요.");   //안내문구
        System.out.print("y = ");
        y = input.nextInt();

        x = x + y;
        // 일단 x에 (초기)x+(초기)y 값을 대입
        y = x - y;
        // 위의 식에서 x = (초기)x+(초기)y가 되었으니 y = x-(초기)y = (초기)x+(초기)y-(초기)y = (초기)x가 된다.
        x = x - y;
        // x=(초기)x+(초기)y, y=(초기)x. 즉, x = x-y = (초기)x+(초기)y-(초기)x = (초기)y 가 된다.

        System.out.println("서로의 값을 바꾼 결과는");
        System.out.println("x = " + x + "\ny = "+ y);

        input.close();
    }
}
