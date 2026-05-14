package exam_method;


class CallByValue {
    public void change(int x, int y) { // 기초형 값 전달
        System.out.println("\nBefore Change X = " + x + " Y = " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After Change  X = " + x + " Y = " + y);
    }
}
public class CallByValueExample {
    public static void main() {
        CallByValue cv = new CallByValue();

        int x = 10;
        int y = 20;
        System.out.println("\n호출 전 Main X = " + x + " Y = " +  y);

        cv.change(x, y);

        System.out.println("\n호출 후 Main X = " + x + " Y = " +  y);
    }
}
