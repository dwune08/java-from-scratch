package simplephoneinfo;
import java.util.Scanner;

public class PhoneBookVer02 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int select;

        while (true) {
            // 프로그램 종료 여부 판별
            do {
                System.out.print("선택하세요.\n1. 데이터 입력\n2. 프로그램 종료\n선택:");
                select = input.nextInt();
            } while (select != 1 && select != 2);
            input.nextLine();

            if(select == 2) { // 2 입력 받은 경우 종료
                System.out.println("프로그램을 종료합니다.");
                break;
            } else { // 1 입력 받은 경우 정보 입력 받기
                PhoneInfo ph1 = new PhoneInfo();
                System.out.print("이름:");
                ph1.setName(input.nextLine());
                System.out.print("전화번호:");
                ph1.setPhoneNumber(input.nextLine());
                System.out.print("생년월일:");
                ph1.setBirthday(input.nextLine());

                System.out.println("\n입력된 정보 출력…");
                ph1.showPhoneInfo();

            }
        }
        input.close();
    }
}


