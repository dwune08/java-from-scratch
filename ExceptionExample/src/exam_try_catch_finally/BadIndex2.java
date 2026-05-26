package exam_try_catch_finally;

public class BadIndex2 {
    public static void main(String[] args) {
        int[] array = new int[10];

        try {
            for (int i = 0; i < array.length; i++) {
                array[i] = i + 1;
            }
            int result = array[10]; // 예외 발생: 배열 인덱스 범위 초과
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 범위를 벗어난 인덱스에 접근했습니다.");
        }
        System.out.println("프로그램은 계속 진행됩니다.");
    }
}