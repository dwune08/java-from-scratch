package exam_class;

public class ForeignStudent extends Student{
    private String nationality;

    public ForeignStudent(String name, int age, int studentNum, String nationality) {
        super(name, age, studentNum);
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String show() {
        return super.show() + ", 국적 : " + nationality;
    }
}
