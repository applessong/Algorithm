package PROGRAMMERS.programmers_step01;

import java.util.Arrays;

public class 예산 {

    public int solution(int[] d, int budget) {
        int answer = 0;
        int max = 0;
        Arrays.sort(d);
        for ( int i = 0 ; i <= d.length-1; i++){
            if (d[i]+max <= budget){
                max+= d[i];
                answer++;
            } else if (d[i]+max > budget){
                return answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        예산 S = new 예산();
        int[] d = {1, 3, 2, 5, 4};
        int budget = 9;

        int[] dCase2 = {2, 2, 3, 3};
        int budgetCase2 = 10;
//        System.out.println(S.solution(a));
        System.out.println(S.solution(d, budget));
        System.out.println(S.solution(dCase2, budgetCase2));

    }
}
