package exam_class;

public class Student extends Person {
    private int studentNum;

    public Student() {
    }

    public Student(String name, int age, int studentNum) {
        super(name, age);
        this.studentNum = studentNum;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public String show() {
        return super.show() + ", 학번 : " + studentNum;
    }
}
