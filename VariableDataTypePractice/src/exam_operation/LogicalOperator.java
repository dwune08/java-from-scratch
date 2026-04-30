package exam_operation;

public class LogicalOperator {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        System.out.println((x == 3) && (y == 7)); // 논리곱(&&) : ~이고
        System.out.println((x == 3) || (y == 4)); // 논리합(||) : ~이거나, ~또는

        boolean result = (++x == 3) && (y++ == 7);
        System.out.println("x = " + x + ", y = " + y); // 결과1
        System.out.println("result = " + result);      // 결과2

        result = (x++ == 4) || (++y == 7);
        System.out.println("x = " + x + ", y = " + y); // 결과3
        System.out.println("result = " + result);      // 결과4
    }
}
