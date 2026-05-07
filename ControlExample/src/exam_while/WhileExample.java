package exam_while;

public class WhileExample {
    public static void main(String[] args) {
        // [예제1] 1부터 5까지 출력하기.
        System.out.println("1에서부터 5까지 출력");
        int i = 1;
        System.out.print("1. 정수: ");
        while(i <= 5) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        i = 1;
        System.out.print("2. 정수: ");
        while(true) { // 조건식이 무조건 참이므로 무한반복(무한루프)
            System.out.print(i + " ");
            i++;
            if(i > 5) { // 반복문을 벗어날 수 있느 조건식을 반드시 명시
                break;  // 반복문을 벗어나는 명령문
            }

        }
        System.out.println();

        // [예제3] 1부터 100까지 합 출력하기 - 하지만 우선 1에서 5까지의 합 출력.
        int num = 1, sum = 0;
        while (num <= 5) {
            sum = sum + num; // sum += num;
            num = num + 1;   // num++;
            // sum += num++;
        }
        System.out.println("1부터 5까지의 합 = " + sum);
    }
}
