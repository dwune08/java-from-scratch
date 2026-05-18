package exam_class;

public class PersonMain {
    public static void main(String[] args) {
        autoDet("홍길동", 56);
        autoDet("한늘봄", 41, 99010001);
        autoDet("Olivia", 39, 97060004, "U.S.A");
    }

    public static void autoDet(String name, int age, int studentNum, String nationality) {
        ForeignStudent f = new ForeignStudent(name, age, studentNum, nationality);
        System.out.println("외국학생["+f.show()+"]");
    }

    public static void autoDet(String name, int age, int studentNum) {
        Student s = new Student(name , age, studentNum);
        System.out.println("학생["+s.show()+"]");
    }

    public static void autoDet(String name, int age) {
        Person s = new Person(name , age);
        System.out.println("사람["+s.show()+"]");
    }
}
