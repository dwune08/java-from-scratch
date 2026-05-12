package example;
import java.util.Scanner;

public class TheaterReserve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] seatStatus = new int[10];
        int sum = 0;

        while(true) {
            // 좌석현황 출력
            System.out.println("--------------------");
            System.out.println("1 2 3 4 5 6 7 8 9 10");
            System.out.println("--------------------");
            for(int i : seatStatus) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("--------------------");

            if(sum == 10) { // 남은 자리가 없는 경우
                System.out.println("남은 자리가 없습니다.\n프로그램을 종료합니다.");
                break;
            }

            System.out.print("원하시는 좌석번호를 입력하세요(종료는 -1):");
            int seatNum = input.nextInt(); // 예약할 좌석 번호 입력 받기

            if(seatNum == -1) { // -1 입력받은 경우 프로그램 종료
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if(seatNum < 1 || seatNum > 10) { // 번호 잘못 입력한 경우
                System.out.println("좌석 번호 선택이 잘못되었습니다.");
            } else if(seatStatus[seatNum-1] == 1) { // 예약 좌석이 찬 경우
                System.out.println("이미 예약된 자리입니다.");
            } else { // 비어 있는 경우
                seatStatus[seatNum - 1] = 1; // 해당 좌석을 예약 상태로 변경
                sum++;
                System.out.println("예약되었습니다.");
            }
        }
        input.close();
    }
}