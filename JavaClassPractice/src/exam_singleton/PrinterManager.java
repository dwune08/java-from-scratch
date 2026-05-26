package exam_singleton;

// 프린터 사용을 관리하는 싱글톤 클래스
public class PrinterManager {
    // 프린터 관리 객체를 단 하나만 생성한다.
    private static final PrinterManager instrance = new PrinterManager();
    private int printcount = 0;

    // 외부에서 객체를 직접 생성하지 못하게 막는다.
    private PrinterManager() {
    }

    // 생성된 PrinterManager 객체를 반환한다.
    public static PrinterManager getInstance() {
        return instrance;
    }

    public void print(String documentName) {
        printcount++;
        System.out.println(documentName + " 문서를 출력합니다.");
        System.out.println("현재까지 출력 횟수 : " + printcount);
    }
}

