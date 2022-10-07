package PROGRAMMERS.programmers_step00;

import java.util.Arrays;

public class 짝수는싫어요 {

    public int[] solution(int n) {
        int leng = n/2;
        if (n % 2 == 1) leng += 1;
        int[] answer = new int[leng];
        for ( int i = 1 ; i <= n ; i++ ){
            if ( i % 2 == 1 ){
                answer[Math.round(i/2)] = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        짝수는싫어요 S = new 짝수는싫어요();
        int a = 10;
        int b = 15;

        System.out.println(Arrays.toString(S.solution(a)));
        System.out.println(Arrays.toString(S.solution(b)));
    }
}
