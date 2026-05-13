package exam_class_basic;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee();
        // 직접 필드에 값 대입
        // emp.name = "홍길동";
        // emp.phoneNumber = "010-2345-3476";
        // emp.salary = 1000000;

        // 메서드를 통해 필드에 값 대입
        emp.employeeData("홍길동", "010-2345-3476", 1000000);
        System.out.println(emp.toString());

        Employee emp2 = new Employee();

        // emp2.name = "김철수";
        // emp2.phoneNumber = "010-3423-5242";
        // emp2.salary = 5000000;

        emp2.employeeData("김철수", "010-3423-5242", 5000000);
        System.out.println(emp2.toString());
    }
}
