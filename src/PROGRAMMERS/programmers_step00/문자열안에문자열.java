package PROGRAMMERS.programmers_step00;

public class 문자열안에문자열 {
    public int solution(String str1, String str2) {
        int answer = 1;
        int index = str1.indexOf(str2);
        if (index < 0){
            answer = 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        문자열안에문자열 S = new 문자열안에문자열();
        String Case1str1 = "ab6CDE443fgh22iJKlmn1o";
        String Case1str2 = "6CD";
        String Case2str1 = "ppprrrogrammers";
        String Case2str2 = "pppp";

        System.out.println(S.solution(Case1str1,Case1str2));
        System.out.println(S.solution(Case2str1,Case2str2));
    }
}
