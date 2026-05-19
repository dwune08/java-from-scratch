package exam_abstract_class;

public class MessageSenderTest {
    public static void main(String[] args) {

        EMailSender emailsender = new EMailSender("생일을 축하합니다", "고객센터", "admin@dukeeshop.co.kr", "10% 할인쿠폰이 발행되었습니다.");
        emailsender.sendMessage("javaone@naver.com");
        SMSSender smssender = new SMSSender("생일을 축하합니다", "고객센터", "02-000-0000", "10% 할인쿠폰이 발행되었습니다.");
        smssender.sendMessage("010-000-0000");
    }
}
