package exam_database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeesSelectTest2 {
    public static void main(String[] args) {
        int employeeId, salary;
        String firstName, departmentName;

        String sql = """
                SELECT e.employee_id, e.first_name, e.salary, d.department_name
                FROM employees e LEFT JOIN departments d
                USING(department_id)
                ORDER BY e.employee_id
                """;
        try (
                Connection conn = DBConnectionUtil.getConnection("XE", "hr", "hr1234");
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
        ) {
            System.out.println("**** EMPLOYEES 테이블 데이터 출력 ****\n");
            System.out.printf("%s\t%s\t%6s\t%8s\n", "사원번호", "사원이름", "급여", "부서명");

            while(rs.next()) {
                employeeId = rs.getInt("employee_id");
                firstName = rs.getString("first_name");
                salary = rs.getInt("salary");
                departmentName = rs.getString("department_name");

                System.out.printf("%-7d %-11s %-6d %s\n", employeeId, firstName, salary, departmentName);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("[드라이버 ERROR] 드라이버를 찾을 수 없습니다.");
        } catch (SQLException e) {
            System.out.println("[DB ERROR] 데이터베이스 작업 중 오류가 발생했습니다.");
            System.out.println(e.getMessage());
        }
    }
}
