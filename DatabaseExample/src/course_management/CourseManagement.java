package course_management;

import academic_management.ManagementService;
import academic_management.MenuViewer;

import java.sql.SQLException;
import java.util.List;

import static academic_management.MenuViewer.keyboard;

public class CourseManagement implements ManagementService {
    private CourseDAO courseDAO = CourseDAO.getInstance();

    @Override
    public void read() {
        try {
            List<courseDTO> list = courseDAO.getAllSubjects();

            if(list.isEmpty()) {
                System.out.println("과목 정보가 존재하지 않습니다.");
            } else {
                for(courseDTO courseDTO : list) {
                    System.out.println(courseDTO);
                }
            }
        } catch (SQLException se) {
            System.out.println("과목 정보를 조회하는 중 오류가 발생했습니다.");
            System.err.println("[read] SQL 오류 : " + se.getMessage());
            // se.pritStackTrace(); // 개발 중 상세 오류 확인 시 사용
        }
    }
    private courseDTO inputData(String mode) {
        String courseNumber = null;
        String courseName = null;
        int credit = 0;
        String courseSection = null;

        switch (mode) {
            case "insert" -> {
                System.out.print("과목번호 입력 : ");
                courseNumber = MenuViewer.keyboard.nextLine();
                System.out.print("과목명 입력 : ");
                courseName = MenuViewer.keyboard.nextLine();
                System.out.print("학점 입력 : ");
                credit = Integer.parseInt(MenuViewer.keyboard.nextLine());
                System.out.print("과목구분 입력 : ");
                courseSection = MenuViewer.keyboard.nextLine();
            }
            case "update" -> {
                System.out.print("수정할 과목번호 입력 : ");
                courseNumber = MenuViewer.keyboard.nextLine();
                System.out.print("수정할 과목명 입력 : ");
                courseName = MenuViewer.keyboard.nextLine();
                System.out.print("수정할 학점 입력 : ");
                credit = Integer.parseInt(MenuViewer.keyboard.nextLine());
                System.out.print("수정할 과목구분 입력 : ");
                courseSection = MenuViewer.keyboard.nextLine();
            }
            case "delete" -> {
                System.out.print("삭제할 과목번호 입력 : ");
                courseNumber = MenuViewer.keyboard.nextLine();
            }
            case "search" -> {
                System.out.print("검색할 과목명 입력 : ");
                courseName = MenuViewer.keyboard.nextLine();
            }
        }
        return new courseDTO(0, courseNumber, courseName, credit, courseSection);
    }

    @Override
    public void create() {
        courseDTO courseDTO = inputData("insert");
        try {
            boolean result = courseDAO.courseInsert(courseDTO);
            System.out.println(result ? "과목 데이터 입력 성공." : "과목 데이터 입력 실패.");
        } catch (SQLException se) {
            System.out.println("과목 정보를 입력하는 중 오류가 발생했습니다.");
            System.err.println("[read] SQL 오류 : " + se.getMessage());
            // se.pritStackTrace(); // 개발 중 상세 오류 확인 시 사용
        }

    }

    @Override
    public void update() {
        courseDTO courseDTO = inputData("update");
        try {
            boolean result = courseDAO.courseUpdate(courseDTO);
            System.out.println(result ? "과목 데이터 수정 성공." : "과목 데이터 수정 실패.");
        } catch (SQLException se) {
            System.out.println("과목 정보를 수정하는 중 오류가 발생했습니다.");
            System.err.println("[read] SQL 오류 : " + se.getMessage());
            // se.pritStackTrace(); // 개발 중 상세 오류 확인 시 사용
        }
    }

    @Override
    public void delete() {
        courseDTO courseDTO = inputData("delete");
        try {

            System.out.print("입력하신 과목번호로 삭제하시겠습니까? [삭제 : 예, 취소 : 아니오] ");
            String confirm = keyboard.next();
            keyboard.nextLine();

            if("예".equals(confirm)) {
                boolean result = courseDAO.courseDelete(courseDTO);
                System.out.println(result ? "과목 데이터 삭제 성공." : "과목 데이터 삭제 실패.");
            } else {
                System.out.println("삭제가 취소되었습니다.");
            }

        } catch (SQLException se) {
            System.out.println("과목 정보를 삭제하는 중 오류가 발생했습니다.");
            System.err.println("[read] SQL 오류 : " + se.getMessage());
            // se.pritStackTrace(); // 개발 중 상세 오류 확인 시 사용
        }
    }

    @Override
    public void search() {
        courseDTO courseDTO = inputData("search");
        try {
            List<courseDTO> list = courseDAO.getSearch(courseDTO);
            if(list.isEmpty()) {
                System.out.println("과목 정보가 존재하지 않습니다.");
            } else {
                    System.out.println(list);
            }
        } catch (SQLException se) {
            System.out.println("과목 정보를 조회하는 중 오류가 발생했습니다.");
            System.err.println("[read] SQL 오류 : " + se.getMessage());
            // se.pritStackTrace(); // 개발 중 상세 오류 확인 시 사용
        }

    }
}