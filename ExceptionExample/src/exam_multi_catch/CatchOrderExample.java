package exam_multi_catch;

public class CatchOrderExample {
    public static void main(String[] args) {
        try {
            // 실행 매개값 가져오기
            String data1 = args[0];
            String data2 = args[1];

            // 문자열을 정수로 변환
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);

            // 두 정수의 합 계산
            int result = value1 + value2;
            System.out.println(value1 + " + " + value2 + " = " + result);

        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("실행 매개값이 부족하거나 숫자로 변환할 수 없습니다.");
            System.out.println("숫자 두 개를 입력해 주세요. 예) 10 20");
        } catch (Exception e) {
            System.out.println("알 수 없는 예외가 발생했습니다.");
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
