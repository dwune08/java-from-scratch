package exam_switch;

import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("사용자의 등급에 따른 권한 출력 프로그램입니다.");
        System.out.print("사용자의 등급을 입력하세요 : ");
        String grade = input.next();

        System.out.println("당신의 등급은 : " + grade + "입니다.");
        System.out.print("해당 등급은 ");
        switch(grade) {
            case "관리자":
                System.out.print("회원관리, 게시글 관리, ");
            case "회원":
                System.out.print("게시글 작성, 댓글 작성, ");
            case "비회원":
                System.out.print("게시글 조회");
                break;
            default:
                System.out.println("잘못된 등급입니다.");
        }
        input.close();
    }
}
