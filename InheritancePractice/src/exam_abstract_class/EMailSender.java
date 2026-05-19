package exam_abstract_class;

public class EMailSender extends MessageSender{
    private String senderAddr;
    private String emailBody;

    public EMailSender(String title, String senderName, String senderAddr, String emailBody) {
        super(title, senderName);
        this.senderAddr = senderAddr;
        this.emailBody = emailBody;
    }

    @Override
    void sendMessage(String receiptAddr) {
        System.out.println("---------------------------------");
        System.out.println("제목:" + super.getTitle());
        System.out.println("보내는 사람: " + super.getSenderName()+ " " + senderAddr);
        System.out.println("받는 사람: " + receiptAddr);
        System.out.println("내용: " + emailBody);
    }


}
