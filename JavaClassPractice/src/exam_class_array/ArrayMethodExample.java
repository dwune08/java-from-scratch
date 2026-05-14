package exam_class_array;

/* 10, 20, 30, 40, 50을 초기값으로 하는 배열을 선언한다.
 * 그리고 배열의 값을 출력하도록 프로그램을 작성한다.
 */

public class ArrayMethodExample {
    public static void main(String[] args) {
        int[] array;
        array = getData();
        printData(array);
    }

    private static int[] getData() {
        int[] testData = new int[]{10,20,30,40,50};
        return testData;
        //return new int[]{10,20,30,40,50};
        //반환    배열의 참조값
    }

    private static void printData(int[] array) { // int[] array = array
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
