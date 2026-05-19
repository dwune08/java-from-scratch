package simplephoneinfo;

// 실행클래스
public class PhoneBookVer03 {
    public static void main(String[] args) {
        while(true) {
            int select = MenuViewer.showMenu();
            if(select == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (select == 1) {           // 입력
                PhoneBookManager.inputData();
            } else if (select == 2) {           // 검색
                PhoneBookManager.searchDate();;
            } else if (select == 3) {           // 삭제
                PhoneBookManager.deleteData();
            } else {
                System.out.println("잘못 입력되었습니다.");
            }
        }
        MenuViewer.input.close();
    }
}