package exam_interface_example;

public class SeparateVolume implements Lendable {
    private int requestNo;
    private String bookTitle;
    private String writer;
    private String borrower;
    private String checkOutDate;
    private String state = "대출 가능";

    public SeparateVolume(int requestNo, String bookTitle, String writer) {
        this.requestNo = requestNo;
        this.bookTitle = bookTitle;
        this.writer = writer;
    }

    @Override
    public void checkOut(String borrower, String date) {
        this.borrower = borrower;
        this.checkOutDate = date;
        // 실제 대출 코드
        System.out.println("=== 도서 대출 ===");
        System.out.println(bookTitle + "(" + writer + ") 이(가) 대출되었습니다.");
        System.out.println("대출인 : " + borrower);
        System.out.println("대출일 : " + checkOutDate);
        System.out.println();
        state = "대출 중";
    }
    @Override
    public void checkIn() {
        // 실제 반납 코드
        System.out.println("=== 반납 처리 ===");
        System.out.println(bookTitle + "이(가) 반납되었습니다.\n");
        state = "대출 가능";
    }

    public int getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(int requestNo) {
        this.requestNo = requestNo;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getBorrower() {
        return borrower;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public String getState() {
        return state;
    }

    public String showBookInfo() {
        return "청구 번호 = " +requestNo+ ", 도서명 = " +bookTitle+ ", 저자 = " +writer+ ", 대출자 = " + borrower + ", 대출일 = " +checkOutDate+ ", 상태 = " + state + "\n";
    }
}
