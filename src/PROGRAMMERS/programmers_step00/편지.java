package PROGRAMMERS.programmers_step00;

public class 편지 {
    public int solution(String message) {
        int answer = message.length()*2;
        return answer;
    }

    public static void main(String[] args) {
        편지 S = new 편지();
        String Case1 = "happy birthday!";
        String Case2 = "I love you~";

        System.out.println(S.solution(Case1));
        System.out.println(S.solution(Case2));
    }
}
