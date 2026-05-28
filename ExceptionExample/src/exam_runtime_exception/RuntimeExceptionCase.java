package exam_runtime_exception;

public class RuntimeExceptionCase {
    public static void main(String[] args) {
        // RuntimeException
        // 실행 중 발생하지만 컴파일러가 예외 처리를 강제하지 않는다.

        // ArrayIndexOutOfBoundsExcption: 배열에서 존재하지 않는 인덱스에 접근할 때 발생한다.
        try {
            int[] arr = new int[3];
            arr[4] = 20;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        // ClassCastExcption 예외 발생
        // 실제 객체 타입과 맞지 않는 타입으로 강제 형변환할 때 발생한다.
        try {
            Object x = Integer.valueOf(0);
            // 부모 클래스명 참조변수 = new 서브클래스생성자();
            System.out.println((String) x);
        } catch (ClassCastException e) {
            e.printStackTrace();
        }

        // NegativeArraySizeException 예외 발생
        // 배열을 생성할 때 크기를 음수로 지정하면 발생한다.
        try {
            int[] arr = new int[-10];
            System.out.println(arr.toString());
        } catch (NegativeArraySizeException e) {
            e.printStackTrace();
        }

        // NullPointerException 예외 발생
        // 참조 변수가 null인 상태에서 메서드나 필드에 접근하면 발생한다.
        // 즉, 객체가 생성되지 않았거나 객체를 참조하지 않는데 사용하려고 할 때 발생한다.
        try {
            String str = null;
            int len = str.length();
            System.out.println(len);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        // NumberFormatException 예외 발생
        // 숫자 형식이 아닌 문자열을 숫자로 변환하려고 할 때 발생한다.
        try {
            String data1 = "100";   // -> 100
            String data2 = "a100";  // -> X

            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);

            int result = value1 + value2;
            System.out.println(data1 + "+" + data2 + "=" + result);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
