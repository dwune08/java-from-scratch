package example;
import java.util.Scanner;

public class Kawibawibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] kbb = new String[]{"가위", "바위", "보"};

        while(true) {
            System.out.print("가위(1), 바위(2), 보(3), 끝내기(4) 중 하나를 선택하세요>>");
            int player = input.nextInt();

            if(player == 4) { // 4 입력시 종료
                System.out.println("프로그램을 종료합니다");
                break;
            } else if(player >= 1 && player <= 4){
                int com = (int)(Math.random()*3)+1; // 1~3 난수 발생
                System.out.println("컴퓨터는 " + kbb[com-1] + "를 냈습니다.");

                // 승패 판결
                if(player == com) System.out.println("비겼습니다.");
                    // 동일한 걸 낸 경우 무승부
                else if(player - com%3 == 1) System.out.println("이겼습니다.");
                    // %3 연산으로 컴퓨터의 보를 0 취급하면 플레이어가 1 높은걸 내면 승리
                else System.out.println("졌습니다.");
                // 나머지 경우는 패배
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
        input.close();
    }
}
