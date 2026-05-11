package exam_array;

import java.util.Scanner;

public class ScoreArray {
    public static void main(String[] args) {
        String[] subarray = {"Java", "C++", "HTML5", "컴퓨터구조", "데이터베이스"};
        int[] score = {95, 88, 76, 62, 55};

        Scanner input = new Scanner(System.in);
        System.out.println("[과목 정보] - 과목명은 대소문자를 정확하게 입력해주세요. [종료는 \"종료\" 입력]");
        for(String s : subarray) {
            System.out.print(s);
            if(!s.equals("데이터베이스")) System.out.print(", ");
        }
        System.out.println();

        while(true) {
            System.out.print("과목 이름>>");
            String name = input.nextLine().trim();

            if(name.equals("종료")) break;
            if(name.isEmpty()) continue; // 빈 줄 입력 시 무시

            boolean found = false;
            for(int i = 0; i < score.length; i++) {
                if(subarray[i].equals(name)) {
                    System.out.println(name + "의 점수는 " +  + score[i]);
                    found = true;
                    break;
                }
            }

            if(!found) {
                System.out.println("없는 과목입니다.");
            }
        }
        System.out.println("프로그램을 종료합니다.");
        input.close();
    }
}