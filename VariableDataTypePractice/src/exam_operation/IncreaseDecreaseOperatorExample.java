package exam_operation;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        System.out.println("--------------------");
        x++;
        ++x;
        System.out.println("x=" + x); // 1 결과

        System.out.println("--------------------");
        y--;
        --y;
        System.out.println("y=" + y); // 2 결과

        System.out.println("--------------------");
        z = x++;
        System.out.println("z=" + z); // 3 결과
        System.out.println("x=" + x); // 4 결과

        System.out.println("--------------------");
        z = ++x;
        System.out.println("z=" + z); // 5 결과
        System.out.println("x=" + x); // 6 결과

        System.out.println("--------------------");
        z = ++x + y++;
        System.out.println("z=" + z); // 7 결과
        System.out.println("x=" + x); // 8 결과
        System.out.println("y=" + y); // 9 결과
    }
}
