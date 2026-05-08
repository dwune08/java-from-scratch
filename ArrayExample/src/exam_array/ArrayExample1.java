package exam_array;

public class ArrayExample1 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        /* int[] numbers = new int[3];
         * numbers[0] = 10;
         * numbers[1] = 20;
         * numbers[2] = 30; */

        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println("numbers[1] = " + numbers[1]);
        System.out.println("numbers[2] = " + numbers[2]);
        System.out.println();

        double[] arrayDouble = new double[2];
        for(int i = 0; i < 2; i++) {
            System.out.println("arrayDouble[" + i + "] = " + arrayDouble[i]);
        }
        System.out.println();

        String[] arrayString = new String[3];
        arrayString[0] = "java";
        arrayString[1] = "oracle";
        arrayString[2] = "springboot";

        //String[] arrayString = new String[]{"java", "orcle", "springboot"};

        for(int i = 0; i < 3; i++) {
            System.out.println("arrayString[" + i + "] = " + arrayString[i]);
        }
    }
}
