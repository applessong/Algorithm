package PROGRAMMERS.programmers_step00;

import java.util.ArrayList;

public class 약수구하기 {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for ( int i = 1 ; i <= n ; i++ ) {
            if ( n%i == 0 ){
                answer.add(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        약수구하기 S = new 약수구하기();
        int Case1 = 24;
        int Case2 = 29;

        System.out.println(S.solution(Case1));
        System.out.println(S.solution(Case2));
    }
}
