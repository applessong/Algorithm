package PROGRAMMERS.programmers_step00;

public class 특정문자제거하기 {
    public String solution(String my_string, String letter) {
        String answer = my_string.replaceAll(letter, "");

        return answer;
    }

    public static void main(String[] args) {
        특정문자제거하기 S = new 특정문자제거하기();
        String Case1str1 = "abcdef";
        String Case1str2 = "f";
        String Case2str1 = "BCBdbe";
        String Case2str2 = "B";

        System.out.println(S.solution(Case1str1,Case1str2));
        System.out.println(S.solution(Case2str1,Case2str2));
    }
}
