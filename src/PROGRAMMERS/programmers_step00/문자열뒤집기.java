package PROGRAMMERS.programmers_step00;

public class 문자열뒤집기 {

    public String solution(String my_string) {
        String answer = "";

        for ( int i = my_string.length()-1 ; i >= 0 ; i--) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
    public String solution2(String myString) {
        return new StringBuilder(myString).reverse().toString();
    }
    ////////스트링빌더에 리버스라는 이런 좋은기능이 있었네.....
    public static void main(String[] args) {
        문자열뒤집기 S = new 문자열뒤집기();
        String a = "jaron";
        String b = "bread";

        System.out.println(S.solution(a));
        System.out.println(S.solution(b));
    }
}
