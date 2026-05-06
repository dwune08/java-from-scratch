package exam_switch;
/* [예제7]
 * 아래 예시와 같이 메뉴를 출력하고
 * 메뉴 번호를 입력하면 "OO메뉴입니다."를,
 * 종료 번호를 입력하면 "프로그램이 종료됩니다."를 출력하세요.
 * [실행 예시]
 * 1. 입력
 * 2. 수정
 * 3. 조회
 * 4. 삭제
 * 7. 종료
 * 메뉴 번호를 입력하세요 : 3
 * 조회 메뉴입니다.
 */

import java.util.Scanner;

public class SwitchStringExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n7. 종료");
        System.out.print("메뉴 번호를 입력하세요 : ");
        num = input.nextInt();

        String menu = switch (num) {
            case 1 -> "입력 메뉴입니다.";
            case 2 -> "수정 메뉴입니다.";
            case 3 -> "조회 메뉴입니다.";
            case 4 -> "삭제 메뉴입니다.";
            case 7 -> "프로그램이 종료됩니다."; // return;
            default -> "잘못 입력하셨습니다.";
        };
        System.out.println(menu);
        input.close();
    }
}
