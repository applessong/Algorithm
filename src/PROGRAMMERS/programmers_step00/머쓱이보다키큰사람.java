package PROGRAMMERS.programmers_step00;

import java.util.Arrays;

public class 머쓱이보다키큰사람 {


    public int solution(int[] array, int height) {
        int answer = 0;
        for ( int i = 0 ; i <= array.length-1 ; i++) {
            if ( array[i] > height ) {
                answer++;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        머쓱이보다키큰사람 S = new 머쓱이보다키큰사람();
        int listCase1[] = {149, 180, 192, 170};
        int Case1 = 167;
        int listCase2[] = {180, 120, 140};
        int Case2 = 190;

        System.out.println(S.solution(listCase1, Case1));
        System.out.println(S.solution(listCase2, Case2));


    }
}
