package exam_class;

public class DogMain {
    public static void main(String[] args) {
        Dog dog1 = new Dog("이쁜이", "요크셔테리어", 1);
        System.out.println(dog1.toString());
        Dog dog2 = new Dog("잠잠이", "포메라니안", 3);
        System.out.println(dog2.toString());
    }
}
