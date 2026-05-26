package exam_singleton;

public class PrinterManagerTest {
    public static void main(String[] args) {
        PrinterManager printer1 = PrinterManager.getInstance();
        PrinterManager printer2 = PrinterManager.getInstance();

        printer1.print("자바 기초 문서");
        printer2.print("싱글톤 패턴 문서");

        if(printer1 == printer2) {
            System.out.println("printer1과 printer2는 같은 프린터 관리자 객체입니다.");
        } else {
            System.out.println("printer1과 printer2는 다른 프린터 관리자 객체입니다.");
        }
    }
}