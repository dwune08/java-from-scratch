package exam_map;

public class Student {
    private int studentNo;      // 학번
    private String studentName; // 이름

    public Student(int studentNo, String studentName) {
        this.studentName = studentName;
        this.studentNo = studentNo;
    }

    @Override
    public String toString() {
        return "이름 : " + studentName + " 학번 : " + studentNo;
    }

    @Override
    public int hashCode() {
        // return studentNo + studentName.hashCode();
        return studentNo;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student student = (Student) obj;
            //  return (studentNo == student.studentNo) && (studentName.equals(student.studentName));
            return studentNo == student.studentNo;
        } else {
            return false;
        }
    }
}
