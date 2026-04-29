package exam_input;
/* [요구사항]
 * 각자의 이름, 나이, 주소를 입력받아 아래와 같이 출력할 수 있도록 작성해 주세요.
 *
 * [출력문 예시]
 * 홍길동님 안녕하세요! 50살이시네요.
 * 주소는 서울특별시 중구 남대문로 120 그레이츠 청계 2F
 */

import java.util.Scanner;

public class InputString {
   public static void main(String[] args) {
       String name, address;
       int age;

       Scanner input = new Scanner(System.in);

       System.out.print("당신의 이름을 입력해주세요 : ");
       name = input.next();
       System.out.print("당신의 나이를 숫자로만 입력해주세요 : ");
       age = input.nextInt();
       input.nextLine(); // 버퍼에 남은 \n 찌꺼기 제거를 위해
       /*
       age = integer.parseInt(input.nextLine());
       이렇게 nextLine으로 입력을 받되 int로 형변환을 하는 것이 더 깔끔할지도
        */
       System.out.print("당신이 현재 거주하는 곳의 주소를 입력해주세요 : ");
       address = input.nextLine();

       System.out.println(name + "님 안녕하세요! " + age + "살이시네요.\n주소는 " + address + ".");

       input.close();
   }
}

