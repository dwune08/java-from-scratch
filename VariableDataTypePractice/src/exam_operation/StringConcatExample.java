package exam_operation;

public class StringConcatExample {
    public static void main(String[] args) {
        String str1 = "JDK" + 25;
        String str2 = str1 + " 버전";
        System.out.println(str2);

        String str3 = "JDK" + 19 + 6.0;
        String str4 = 19 + 6.0 + "JDK";
        System.out.println(str3);
        System.out.println(str4);
    }
}
