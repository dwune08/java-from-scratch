package simplephoneinfo;
import java.util.Scanner;

// 메뉴 클래스
public class MenuViewer {
    public static Scanner input = new Scanner(System. in);

    public static int showMenu() {
        System.out.println("선택하세요 ... ");
        System.out.println("1. 데이터 입력");
        System.out.println("2. 데이터 검색");
        System.out.println("3. 데이터 삭제");
        System.out.println("4. 프로그램 종료");
        System.out.print("선택: ");
        return input.nextInt();
    }
}
