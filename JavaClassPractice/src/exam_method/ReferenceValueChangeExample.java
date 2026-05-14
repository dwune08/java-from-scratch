package exam_method;

class ReferenceValueChange {
    public int x;

    public void change(ReferenceValueChange rs2) {
        System.out.println("\nBefore Change x = " + rs2.x);
        rs2.x = 200;
        System.out.println("\nBefore Change x = " + rs2.x);
    }
}

public class ReferenceValueChangeExample {
    public static void main(String[] args) {
        ReferenceValueChange rv = new ReferenceValueChange();
        rv.x = 10;
        System.out.println("Main Before Calling x = " + rv.x);

        rv.change(rv);
        System.out.println("Main Before Calling x = " + rv.x);
    }
}
