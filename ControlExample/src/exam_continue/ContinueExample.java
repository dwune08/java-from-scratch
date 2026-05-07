package exam_continue;

/* 문자열 "no news is good news"을 대상으로
 * 반복하며 문자 'n'이 나타나는 횟수를 카운팅한다.
 * 만약 현재의 문자가 'n'이 아니면 continue문에 의하여
 * 루프의 나머지 부분을 생략하고 다음 문자를 처리하도록 코딩한다.
 * [참고]
 * 문자의 길이는 문자열변수명.length()로 얻을 수 있으며
 * 문자열변수명.charAT(0)을 사용하면 문자열에서 첫번째 글자 하나만 반환한다.
 */

public class ContinueExample {
    public static void main(String[] args) {
        String s = "no news is good news";
        int count = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != 'n') continue;
            count++;
        }
        System.out.println("n개수 : " + count);
    }
}
