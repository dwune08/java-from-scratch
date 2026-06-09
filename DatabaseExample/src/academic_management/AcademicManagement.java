package academic_management;

import course_management.CourseManagement;
import subject_management.SubjectManagement;

public class AcademicManagement {
    public static final int SUBJECT_MANAGEMENT = 1;
    public static final int STUDENT_MANAGEMENT = 2;
    public static final int COURSE_MANAGEMENT = 3;
    public static final int EXIT = 4;

    public static void main(String[] args) {
        System.out.println("학사 관리 프로그램을 시작합니다 .. ");

        while (true) {
            MenuViewer.showTopMenu();
            int topMenuChoice = MenuViewer.menuInput();

            switch (topMenuChoice) {
                case SUBJECT_MANAGEMENT -> subMenu(new SubjectManagement());
                case STUDENT_MANAGEMENT -> System.out.println("학생 관리 기능은 추후 구현 예정입니다.");
                case COURSE_MANAGEMENT -> subMenu(new CourseManagement());
                case EXIT -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
                default -> System.out.println("1 ~ 3 중메서 선택해 주세요.");
            }
        }
    }

    private static void subMenu(ManagementService management) {
        while (true) {
            MenuViewer.showSubMenu();
            int subMenuChoice = MenuViewer.menuInput();

            switch (subMenuChoice) {
                case 0 -> {
                    System.out.println("상위 메뉴로 돌아갑니다.\n");
                    return;
                }
                case 1 -> management.read();
                case 2 -> management.create();
                case 3 -> management.update();
                case 4 -> management.delete();
                case 5 -> management.search();
                default -> System.out.println("0 ~ 5 중메서 선택해 주세요.");
            }
        }
    }

}
