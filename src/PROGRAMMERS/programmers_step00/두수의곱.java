package PROGRAMMERS.programmers_step00;

public class 두수의곱 {
    public int solution(int num1, int num2) {
        int answer = num1*num2;
        return answer;
    }

    public static void main(String[] args) {
        두수의곱 S = new 두수의곱();
        int Case1a = 3;
        int Case1b = 4;
        int Case2a = 27;
        int Case2b = 19;

        System.out.println(S.solution(Case1a,Case1b));
        System.out.println(S.solution(Case2a,Case2b));
    }
}

