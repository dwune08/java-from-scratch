package hello;

public class PrintQuiz2 {
    public static void main(String[] args) {
        System.out.println("==== 자바 수업 시간표 ====");
        System.out.println("1교시: 자바 소개");
        System.out.println("2교시: 개발 환경 설치");
        System.out.println("3교시: 출력문 연습");
        System.out.println("=======================");

        String data ="""
                ==== 자바 수업 시간표 ====
                1교시: 자바 소개
                2교시: 개발 환경 설치
                3교시: 출력문 연습
                =======================
                """;
        System.out.println(data);
    }
}
