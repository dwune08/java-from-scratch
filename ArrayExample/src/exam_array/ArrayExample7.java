package exam_array;

public class ArrayExample7 {
    public static void main(String[] args) {
        int[] array = new int[10];

        // 1~10 난수 9개 생성하여 배열에 넣고 출력하기
        System.out.println("[정렬전]");
        for(int i = 0; i < array.length-1; i++) {
            array[i] = (int)(Math.random()*10)+1;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // 정렬
        for(int i = 0; i < array.length-2; i++) {
            for(int j = i+1; j < array.length-1; j++) {
                if(array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

        // 합계를 구하고 출력하기
        System.out.println("[정렬후]");
        for(int i = 0; i < array.length; i++) {
            if(i < array.length-1) {
                System.out.print(array[i]);
                array[array.length-1] += array[i];
                if(i == array.length-2) System.out.print(" = ");
                else System.out.print(" + ");
            } else {
                System.out.print(array[i]);
            }
        }
    }
}