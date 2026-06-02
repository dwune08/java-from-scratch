package exam_throws;

import java.io. FileReader;
import java.io. FileWriter;
import java. io. IOException;

public class ExceptionMethod {
    public static void main(String[] args) {
        String fileName = "test.txt";
        fileWrite(fileName);
        fileRead(fileName);
    }
    // FileWriter를 이용하여 test.txt 파일에 문자열 저장
    public static void fileWrite(String fileName) {
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write("Java Programming");
            System.out.println("파일 저장이 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("파일 저장 중 오류가 발생했습니다.");
        }
    }
    // FileReader를 이용하여 test.txt 파일을 읽어 콘솔에 출력
    public static void fileRead(String fileName) {
        try (FileReader fr = new FileReader (fileName)) {
            int data;
            System.out.print("파일 내용: ");

            // FileReader는 문자를 하나씩 읽는다.
            // 더 이상 읽을 문자가 없으면 -1을 반환한다.
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e){
            System.out.println("파일 읽기 중 오류가 발생했습니다.");
        }
    }
}