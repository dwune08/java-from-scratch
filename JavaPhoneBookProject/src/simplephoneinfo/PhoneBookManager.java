package simplephoneinfo;
import java.util.Scanner;

// 데이터 입력, 검색, 삭제 클래스
public class PhoneBookManager extends PhoneInfo{
    private static PhoneInfo[] phoneinfo = new PhoneInfo[100];
    private static int num = 0;
    static Scanner input = new Scanner(System.in);

    public PhoneBookManager(String name, String phoneNumber, String birthday) {
        super(name, phoneNumber, birthday);
    }

    // 데이터 입력
    public static void inputData() {
        phoneinfo[num] = new PhoneInfo();
        System.out.print("이름 : ");
        phoneinfo[num].setName(input.nextLine());
        System.out.print("전화번호 : ");
        phoneinfo[num].setPhoneNumber(input.nextLine());
        System.out.print("생년월일 : ");
        phoneinfo[num].setBirthday(input.nextLine());
        System.out.println("데이터의 입력이 완료되었습니다.");
        num++;
    }
    // 데이터 검색
    public static void searchDate() { // 데이터 검색
        int search = 100;
        System.out.println("데이터 검색을 시작합니다.");
        System.out.print("이름 : ");
        String name = input.nextLine();
        for(int i = 0; i < num; i++) {
            if(name.equals(phoneinfo[i].getName())) {
                search = i;
            }
        }
        if(search != 100) phoneinfo[search].showPhoneInfo();
        else System.out.println("찾는 정보가 없습니다.");
    }
    // 데이터 삭제
    public static void deleteData() {
        int search = 100;
        System.out.println("데이터 삭제를 시작합니다.");
        System.out.print("이름 : ");
        String name = input.nextLine();
        // 해당 데이터 검색
        for(int i = 0; i < num; i++) {
            if(name.equals(phoneinfo[i].getName())) {
                search = i;
            }
        }
        // 해당 데이터를 삭제하고 뒤의 데이터들을 당겨오기
        if(search != 100) {
            for(int i = search; i < num-1; i++) {
                phoneinfo[i].setName(phoneinfo[i+1].getName());
                phoneinfo[i].setPhoneNumber(phoneinfo[i+1].getPhoneNumber());
                phoneinfo[i].setBirthday(phoneinfo[i+1].getBirthday());
            }
            phoneinfo[num] = new PhoneInfo();
            num--;
        }
        else System.out.println("찾는 정보가 없습니다.");
    }

}
