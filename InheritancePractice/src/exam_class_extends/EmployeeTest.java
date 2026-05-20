package exam_class_extends;

public class EmployeeTest {
    public static void main(String[] args) {

        /*
        // 실행결과1
        Employee emp1 = new Employee();
        Manager mgr1 = new Manager();

        emp1.setName("김철수");
        emp1.setAddress("서울시 영등포구 당산6가");
        emp1.setPhoneNumber("010-2353-3245");
        emp1.setSalary(15000000);

        mgr1.setName("홍길동");
        mgr1.setAddress("서울시 성동구");
        mgr1.setPhoneNumber("010-7869-0987");
        mgr1.setSalary(20000000);
        mgr1.setJob("대리");
        mgr1.setBonus(100000);
        */

        // 실행결과 2
        Employee emp2 = new Employee("김철수", "서울시 영등포구 당산6가", "010-2353-3245", 15000000);
        System.out.println(emp2.toString());

        System.out.println(); // 구분을 위해

        Manager mgr2 = new Manager("홍길동", "서울시 성동구", "010-7869-0987", 2000000, 100000, "대리");
        System.out.println(mgr2.toString());

        // 실행결과 3

        Employee[] e = {
                new Employee("이진희", "서울시 영등포구 당산6가", "010-2353-3553", 1500000),
                new Manager("홍길동", "서울시 성동구", "010-7869-0987", 2000000, 100000,"대리" )
        };

        for(int i = 0; i < e.length; i++) {
            //System.out.println(e[i].toString());
            System.out.println(e[i]);
        }
        System.out.println();

        for(Employee ee : e) {
            //System.out.println(ee.toString());
            System.out.println(ee);
        }
    }
}