package PROGRAMMERS.programmers_step01;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class 자릿수더하기 {
    public int solution1(int n) {
        int answer = 0;
        int leng = (n+"").length();
        String str = n+"";
        for ( int i = 0 ; i <= leng-1 ; i++ ){
            answer += str.charAt(i)-'0';
        }
        System.out.println("형변환 필요O 문자배열로 바꿔서 배열순서대로 더해주는방식");
        return answer;
    }

    public int solution2(int n) {
        int answer = 0;
        int leng = (n+"").length();
        int num = 0;
        for ( int i = 0 ; i <= leng-1 ; i++ ){
            num = n%10;
            n /= 10;
            answer += num;
        }
        System.out.println("형변환 필요X 나머지값 더해주는 방식");
        return answer;
    }

    public static void main(String[] args) {
        자릿수더하기 S = new 자릿수더하기();
        int a = 123;
        int b = 987;

        System.out.println(S.solution1(a));
        System.out.println(S.solution1(b));
        System.out.println(S.solution2(a));
        System.out.println(S.solution2(b));
    }
}
