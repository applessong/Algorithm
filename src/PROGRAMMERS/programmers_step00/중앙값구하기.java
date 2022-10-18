package PROGRAMMERS.programmers_step00;

import java.util.Arrays;

public class 중앙값구하기 {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[(array.length/2)];
    }

    public static void main(String[] args) {
        중앙값구하기 S = new 중앙값구하기();
        int[] Case1 = {1, 2, 7, 10, 11};
        int[] Case2 = {9, -1, 0};

        System.out.println(S.solution(Case1));
        System.out.println(S.solution(Case2));
    }
}
