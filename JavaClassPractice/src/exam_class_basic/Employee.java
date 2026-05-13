package exam_class_basic;

/* 직원 정보를 저장할 Employee 클래스를 생성하여 보자.
 * 직원은 이름(name), 전화 번호(phoneNumber), 급여(salary)를 필드로 가진다.
 * 직원 정보를 실행 클래스에서 임의의 값으로 설정하여 준다.
 * 그 후 화면에 전체 필드의 내용이 출력되도록 작성한다.
 */

public class Employee {
    // 필드 (선언방법 : 자료형 변수;)
    public String name;         // 이름
    public String phoneNumber;  // 전화 번호
    public int salary;          // 급여

    // 메서드(선언방법 : 리턴타입 메서드명(매개변수...) {...}
    // 필드에 값을 설정하기 위한 메서드
    public void employeeData(String eName, String pNumber, int sal) {
        name = eName;
        phoneNumber = pNumber;
        salary = sal;
    }

    // 출력할 문자열 반환 메서드
    public String toString() {
        // return "직원정보 [ 사원명 = " + name + ", 전화번호 = " + phoneNumber + ", 급여 = " + salary + "]";
        return String.format("직원정보 [ 사원명: %s, 전화번호 = %s, 급여 = %,d ]", name, phoneNumber, salary);
    }
}
