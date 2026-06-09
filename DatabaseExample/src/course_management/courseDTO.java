package course_management;

public class courseDTO {
    private int no;
    private int credit;
    private String courseName;
    private String courseNumber;
    private String courseSection;


    public courseDTO() {
    }

    public courseDTO(int no, String courseNumber, String courseName, int credit, String courseSection) {
        this.no = no;
        this.credit = credit;
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.courseSection = courseSection;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseSection() {
        return courseSection;
    }

    public void setCourseSection(String courseSection) {
        this.courseSection = courseSection;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return String.format("%-3d\t%8s\t%-20s\t%d\t%3s", no, courseNumber, courseName, credit, courseSection);
    }
}
