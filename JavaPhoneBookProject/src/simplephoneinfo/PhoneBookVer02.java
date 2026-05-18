package simplephoneinfo;
import java.util.Scanner;

public class PhoneBookVer02 {
    public static Scanner input = new Scanner(System.in);
    public static int showMenu() { // 프로그램 가동 메뉴 메서드
        int select;
        do {
            System.out.print("선택하세요.\n1. 데이터 입력\n2. 프로그램 종료\n선택:");
            select = input.nextInt();
        } while (select != 1 && select != 2);
        input.nextLine();
        return select;
    }

    public static void readData() { // 정보 입력받고 출력하는 메서드
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

    public static void main(String[] args) {
        while (true) {
            if(showMenu() == 1) {   // 1 입력 받은 경우 정보 입력 받기
                readData();
            } else {                // 2 입력 받은 경우 종료
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
        input.close();
    }
}


