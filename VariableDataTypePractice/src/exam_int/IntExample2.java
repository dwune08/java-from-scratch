package exam_int;

/* [요구사항]
   두 수를 입력받아 a,b 변수에 대입 후 변수 a에 기억된 값을 1 증가시키고,
   변수 b에 기억된 값은 1 감소시켜서 출력하는 프로그램을 작성하시오.
*/


import java.util.Scanner;


public class IntExample2 {
    public static void main(String[] args) {
        int a, b;
        // 정수형 변수 a, b를 선언

        Scanner input = new Scanner(System.in); // Scanner 클래스 소환

        System.out.println("a의 값을 입력해주세요.");   //안내문구
        System.out.print("a = ");
        a = input.nextInt();
        System.out.println("b의 값을 입력해주세요.");   //안내문구
        System.out.print("b = ");
        b = input.nextInt();

        a = a + 1;
        b = b - 1;

        System.out.println("두 수의 상태가?!");
        System.out.println("a = " + a + "\nb = "+ b);

        input.close();
    }
}
