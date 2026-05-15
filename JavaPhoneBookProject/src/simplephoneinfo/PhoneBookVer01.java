package simplephoneinfo;

/*
 * 전화번호 관리 프로그램 구현 프로젝트
 * Version 0.1
 */

public class PhoneBookVer01 {
    public static void main(String[] args) {
        PhoneInfo ph1 = new PhoneInfo("임미경", "010-2345-6573", "1965.03.28");
        PhoneInfo ph2 = new PhoneInfo("김현수", "010-6435-1249");

        ph1.showPhoneInfo();
        ph2.showPhoneInfo();
    }
}
