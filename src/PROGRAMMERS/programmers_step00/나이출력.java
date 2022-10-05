package PROGRAMMERS.programmers_step00;

public class 나이출력 {
    public int solution(int age) {
        int year = 2022;
        int answer = 2022+1-age;
        return answer;
    }

    public static void main(String[] args) {
        나이출력 S = new 나이출력();
        int Case1 = 40;
        int Case2 = 23;

        System.out.println(S.solution(Case1));
        System.out.println(S.solution(Case2));
    }
}
