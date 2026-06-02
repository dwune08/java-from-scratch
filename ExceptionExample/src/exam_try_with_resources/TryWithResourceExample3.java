package exam_try_with_resources;

import java. io.BufferedReader;
import java. io.FileReader;
import java. io. IOException;

public class TryWithResourceExample3 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line;

            // readLine()은 파일을 한 줄씩 읽는다.
            // 더 이상 읽을 줄이 없으면 null을 반환한다.
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("파일을 읽는 중 오류가 발생했습니다.");
        }
    }
}
