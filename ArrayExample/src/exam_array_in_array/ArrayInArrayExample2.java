package exam_array_in_array;

public class ArrayInArrayExample2 {
    public static void main(String[] args) {
        String[] rollBook = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
                             "송성실", "윤예의", "진재주", "김철수", "홍길동", "배혜진"};
        String[][] part1 = new String[3][2];
        String[][] part2 = new String[3][2];
        int num = 0;

        for(int i = 0; i < part1.length; i++) {
            for(int j = 0; j < part1[i].length; j++) {
                part1[i][j] = rollBook[num];
                part2[i][j] = rollBook[num + rollBook.length/2];
                num++;
            }
        }
        System.out.println("== 1분단 ==");
        for(int i = 0; i < part1.length; i++) {
            for (int j = 0; j < part1[i].length; j++) {
                System.out.printf("%s ", part1[i][j]);
            }
            System.out.println();
        }
        System.out.println("== 2분단 ==");
        for(int i = 0; i < part2.length; i++) {
            for (int j = 0; j < part2[i].length; j++) {
                System.out.printf("%s ", part2[i][j]);
            }
            System.out.println();
        }
    }
}
