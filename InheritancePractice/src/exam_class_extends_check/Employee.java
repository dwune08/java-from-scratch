package exam_class_extends_check;

public class Employee extends Person {
    private String departmentName;

    public Employee() {
        super(); // 상위(부모) 클래스의 디폴트 생성자 호출. 명사하지 않아도 컴파일러에 의해 자동으로 생성됨.
        System.out.println("Employee 생성자 호출");
    }

    public Employee(String name, int age, String departmentName) {
        /* super();         // 상위 클래스의 디폴트 생성자 호출.
        setName(name);      // 설정자로 name 필드값 대입
        setAge(age);        // 설정자로 age 필드값 대입
         */

        super(name, age);
        this.departmentName = departmentName;
        System.out.println("Employee(name, age, dept) 생성자 호출");
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String toString() {
        return super.toString() + ":" + getDepartmentName();
    }
}

