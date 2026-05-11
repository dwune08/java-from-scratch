package exam_array;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] alphabet = new char[26];

        for(int i= 0; i < 26; i++) {
            alphabet[i] = (char)('A' + i); // 'A'부터 하나씩 증가하며 저장
        }
        for(char c : alphabet) {
            System.out.print(c);
        }
        System.out.println();

        for(char c : alphabet) {
            System.out.print((char)(c-'A'+'a'));
        }
        System.out.println();

        for(char c : alphabet) {
            System.out.println(c + " " + (char)(c - 'A' + 'a'));
            // 대문자와 소문자의 아스키코드값 차이를 계산해 소문자도 함께 출력
        }
    }
}
