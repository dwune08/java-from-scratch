package exam_abstract_class;

public class SMSSender extends MessageSender{
    private String senderPhoneNo;
    private String message;

    public SMSSender(String title, String senderName, String senderPhoneNo, String message) {
        super(title, senderName);
        this.senderPhoneNo = senderPhoneNo;
        this.message = message;
    }

    @Override
    void sendMessage(String receiptPhoneNo) {
        System.out.println("---------------------------------");
        System.out.println("제목:" + super.getTitle());
        System.out.println("보내는 사람: " + super.getSenderName());
        System.out.println("전화번호: " + receiptPhoneNo);
        System.out.println("회신 전화번호: " + senderPhoneNo);
        System.out.println("내용: " + message);
    }


}
