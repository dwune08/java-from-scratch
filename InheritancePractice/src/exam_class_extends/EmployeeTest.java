package exam_class_extends;

public class EmployeeTest {
    public static void main(String[] args) {

/*
        Employee e = new Employee();
        Manager m = new Manager();

        e.setName("김철수");
        e.setAddress("서울시 영등포구 당산6가");
        e.setPhoneNumber("010-2353-3245");
        e.setSalary(15000000);

        m.setName("홍길동");
        m.setAddress("서울시 성동구");
        m.setPhoneNumber("010-7869-0987");
        m.setSalary(20000000);
        m.setJob("대리");
        m.setBonus(100000);
*/
        Employee e = new Employee("김철수", "서울시 영등포구 당산6가", "010-2353-3245", 15000000);
        System.out.println(e.toString());

        System.out.println(); // 구분을 위해

        Manager m = new Manager("홍길동", "서울시 성동구", "010-7869-0987", 2000000, 100000, "대리");
        System.out.println(m.toString());
    }

}
