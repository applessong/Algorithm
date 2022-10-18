package PROGRAMMERS.programmers_step00;

import java.util.ArrayList;
import java.util.Arrays;

public class 아이스아메리카노 {
    public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money/5500;
        answer[1] = money%5500;
        return answer;
    }

    public static void main(String[] args) {
        아이스아메리카노 S = new 아이스아메리카노();
        int Case1 = 5500;
        int Case2 = 15000;

        System.out.println(Arrays.toString(S.solution(Case1)));
        System.out.println(Arrays.toString(S.solution(Case2)));
    }
}
