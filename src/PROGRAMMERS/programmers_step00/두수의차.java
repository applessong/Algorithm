package PROGRAMMERS.programmers_step00;

import PROGRAMMERS.알고리즘샘플;

public class 두수의차 {
    public int solution(int num1, int num2) {
        int answer = num1-num2;


        return answer;
    }

    public static void main(String[] args) {
        두수의차 S = new 두수의차();
        int Case1a = 2;
        int Case1b = 3;
        int Case2a = 100;
        int Case2b = 2;

        System.out.println(S.solution(Case1a,Case1b));
        System.out.println(S.solution(Case2a,Case2b));
    }
}
