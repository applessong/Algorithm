package PROGRAMMERS.programmers_step00;

public class 두수의나눗셈 {
    public int solution(int num1, int num2) {
    double a = (((double)num1 / num2)) * 1000;
    int answer = (int)a;
    return answer;
}

    public static void main(String[] args) {
        두수의나눗셈 S = new 두수의나눗셈();
        int Case1a = 3;
        int Case1b = 2;
        int Case2a = 7;
        int Case2b = 3;

        System.out.println(S.solution(Case1a,Case1b));
        System.out.println(S.solution(Case2a,Case2b));
    }
}
