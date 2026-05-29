package exam_try_with_resources;

import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceExample2 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("file.txt")) {
            int data;
            // FileReader는 문자를 하나씩 읽는다.
            // 더 이상 읽을 문자가 없으면 -1를 반환한다.
            while ((data = reader.read()) != -1) {
                System.out.print((char)data);
            }
        } catch (IOException e) {
            System.out.println("파일을 읽는 중 오류가 발생했습니다.");
        }
    }
}