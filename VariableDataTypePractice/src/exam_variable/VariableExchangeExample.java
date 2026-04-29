package exam_variable;
// 정수형 변수 2개를 선언하여 각각 변수에 값을 초기화하여 두수를 교환한 값을 출력하는 프로그램을 작성해 보자.
public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3, y = 5;
        // 정수형 변수 x, y를 선언하며 각각의 값을 초기화

        System.out.println("x와 y의 초기값은");
        System.out.println("x = " + x + "\ny = "+ y);
        //x, y의 값을 각각 출력해서 초기 값을 보여줌

        x = x + y;
        // 일단 x에 (초기)x+(초기)y 값을 대입
        y = x - y;
        // 위의 식에서 x = (초기)x+(초기)y가 되었으니 y = x-(초기)y = (초기)x+(초기)y-(초기)y = (초기)x가 된다.
        x = x - y;
        // x=(초기)x+(초기)y, y=(초기)x. 즉, x = x-y = (초기)x+(초기)y-(초기)x = (초기)y 가 된다.

        System.out.println("서로의 값을 바꾼 결과는");
        System.out.println("x = " + x + "\ny = "+ y);
    }
}
