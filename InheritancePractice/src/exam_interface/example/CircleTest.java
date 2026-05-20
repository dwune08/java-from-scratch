package exam_interface.example;

/* 자바에서는 객체의 크기를 비교하는데 사용되는
 * java.lang.Comparable 인터페이스를 제공해 준다.
 * public interface Comparable {
 *  // 이 객체가 다른 객체보다 크면 1, 같으면 0, 작으면 -1을 반환한다.
       int comparedTo(Object other);
   }
*/

class Circle implements Comparable {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public int compareTo(Object o) {
        Circle c = (Circle) o;
        if(this.radius > c.radius) return 1;
        else if (this.radius == c.radius) return 0;
        else return -1;
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        Circle c2 = new Circle(6.0);

        if(c1.compareTo(c2) > 0) {
            System.out.println("첫 번째 원의 반지름이 두 번째 원보다 크다.");
        } else if(c1.compareTo(c2) == 0) {
            System.out.println("두 원의 반지름이 같다.");
        } else {
            System.out.println("첫 번째 원의 반지름이 두 번째 원보다 작다.");
        }
    }
}
