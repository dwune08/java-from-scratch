package exam_interface_example;

public class AppCDInfo extends CDInfo implements Lendable{
    private String borrower;
    private String checkOutDate;
    private String state = "대출 가능";

    public AppCDInfo(String registerNo, String title) {
        super(registerNo, title);
    }

    @Override
    public void checkOut(String borrower, String date) {
        this.borrower = borrower;
        this.checkOutDate = date;
        // 실제 대출 코드
        System.out.println("=== 앱 CD 대출 ===");
        System.out.println(super.getTitle() + " CD가 대출되었습니다.");
        System.out.println("대출인 : " + borrower);
        System.out.println("대출일 : " + checkOutDate);
        System.out.println();
        state = "대출 중";
    }

    @Override
    public void checkIn() {
        // 실제 반납 코드
        System.out.println(super.getTitle() + " CD가 반납되었습니다.\n");
        state = "대출 가능";

    }

    public String showCDInfo() {
        return "등록 번호 = " +getRegisterNo()+ ", 제목 = " +getTitle()+ ", 대출자 = " + borrower + ", 대출일 = " +checkOutDate+ ", 상태 = " + state + "\n";
    }
}
