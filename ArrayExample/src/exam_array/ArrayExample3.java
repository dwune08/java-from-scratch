package exam_array;

/* 배열에 대입된 점수에 해당하는 막대 그래프를 출력하시오. */

public class ArrayExample3 {
    public static void main(String[] args) {
        int[] score = {90,20,50,70,65,90,100,43,55,87};

        System.out.println("====== 성적 분포 그래프 ======");
        for(int i : score) {
            System.out.printf("%3d점 | ", i);

            for(int j = 0; j < i/10; j++) {
                System.out.print("■ ");
            } // 십의 자리 1당 박스 하나씩

            if(i % 10 >= 5) System.out.println("□ ");
            else System.out.println();
            // 일의자리가 5 이상인 경우 빈 박스 추가
        }
        System.out.println("===========================");
    }
}
