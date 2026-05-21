package exam_generic_type;

class MyMath<T extends Number> {
    public double getAverage(T[] a) {
        double sum = 0.0;

        for(int i = 0; i < a.length; i++) {
            sum += a[i].doubleValue();
        }
        return sum/a.length;
    }
}

public class MyMathExample {
    public static void main(String[] args) {
        Integer[] list = {1,2,3,4,5,6};

        MyMath<Integer> m = new MyMath<Integer>(); // Integer 클래스는 Number 클래스의 하위
        System.out.println(m.getAverage(list));

        Double[] data = {6.9, 9.2, 5.3};
        MyMath<Double> m1 = new MyMath<Double>();
        System.out.printf("%.1f\n", m1.getAverage(data));

        String[] value = {"1", "4", "9"};
        //MyMath<String> m2 = new MyMath<String>();
        //System.out.println(m2.getAverage(value));
    }
}
