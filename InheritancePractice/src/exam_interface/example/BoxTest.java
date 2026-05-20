package exam_interface.example;

class Box implements Comparable {
    private double volume;

    public Box(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public int compareTo(Object obj) { // Object obj = b2 업캐스팅
        Box other = (Box) obj; // (하위 클래스명) 상위 클래스의 참조변수. 다운캐스팅
        if(this.volume < other.volume) return -1;
        else if (this.volume > other.volume) return 1;
        else return 0;
    }
}

public class BoxTest {
    public static void main(String[] args) {
        Box b1 = new Box(100.4);
        Box b2 = new Box(85.0);

        // compareTO 메서드에 비교할 대상을 명시하고 비교
        if(b1.compareTo(b2) > 0) {
            System.out.println("첫 번째 박스의 부피가 두 번째 박스보다 큽니다.");
        } else if(b1.compareTo(b2) == 0) {
            System.out.println("두 박스의 부피가 같습니다.");
        } else {
            System.out.println("첫 번째 박스의 부피가 두 번째 박스보다 작습니다.");
        }
    }
}
