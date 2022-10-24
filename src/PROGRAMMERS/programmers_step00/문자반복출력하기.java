package PROGRAMMERS.programmers_step00;

public class 문자반복출력하기 {
    public String solution(String my_string, int n) {
        String answer = "";
        for ( int i = 0 ; i <= my_string.length()-1 ; i++ ){
            for ( int j = 1 ; j <= n ; j ++ ){
                answer += my_string.charAt(i);
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        문자반복출력하기 S = new 문자반복출력하기();
        String Case1 = "hello";
        int Case1num = 3;

        System.out.println(S.solution(Case1, 3));
    }
}
