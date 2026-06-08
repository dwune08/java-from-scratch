package subject_management;

public class SubjectDTO {
    private int no;
    private String subjectNumber;
    private String subjectName;

    public SubjectDTO() {}
    public SubjectDTO(int no, String subjectNumber, String subjectName) {
        this.no = no;
        this.subjectNumber = subjectNumber;
        this.subjectName = subjectName;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getSubjectNumber() {
        return subjectNumber;
    }

    public void setSubjectNumber(String subjectNumber) {
        this.subjectNumber = subjectNumber;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return String.format("%-3d\t%4s\t%s", no, subjectNumber, subjectName);
    }
}
