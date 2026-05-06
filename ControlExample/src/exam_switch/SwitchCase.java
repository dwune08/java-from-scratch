package exam_switch;

/* 미래건물의 각 층별 정보를 제공하고자 한다.
 * 1층은 약국, 2층은 정형외과, 3층은 피부과, 4층은 치과, 5층은 헬스클럽이 입점하고 있다.
 * 층수를 입력받아 입점 정보를 출력해 주세요.
 *
 * [출력 예시]
 * 각 층 정보를 제공하고자 합니다. 1 ~ 5 층 수를 입력해 주세요.5
 * 5층은 헬스클럽입니다.  */

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int floor;

        System.out.print("각 층 정보를 제공하고자 합니다.\n1 ~ 5 층 수를 입력해 주세요. ");
        floor = input.nextInt();
        String info = switch (floor) {
            case 1 -> "약국";
            case 2 -> "정형외과";
            case 3 -> "피부과";
            case 4 -> "치과";
            case 5 -> "헬스클럽";
            default -> "존재하지 않습니다.\n만약 이 문구가 보인다면 당장 탈출하세요.\n그곳은 지옥";
        };

        System.out.println(floor + "층은 " + info + "입니다.");
        input.close();
    }
}
