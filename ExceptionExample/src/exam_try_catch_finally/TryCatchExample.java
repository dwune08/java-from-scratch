package exam_try_catch_finally;
import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while(true) {
            try {
                System.out.print("정수를 입력해 주세요 : ");
                String input = scanner.nextLine();

                // 아무것도 입력하지 않고 엔터만 누른 경우
                if(input.isBlank()) {
                    System.out.println("입력값이 없습니다. 정수를 입력하세요.");
                    continue;
                }

                // 문자열을 정수로 변환
                number = Integer.parseInt(input);

                // 정수 변환에 성공하면 반복문 종료
                break;

            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 정수를 입력하세요.");
            }
        }

        System.out.println("입력받은 수 : " + number);
        scanner.close();
    }
}
