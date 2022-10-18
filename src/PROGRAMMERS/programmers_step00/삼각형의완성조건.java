package PROGRAMMERS.programmers_step00;

import java.util.Arrays;

public class 삼각형의완성조건 {
    public int solution(int[] sides) {
        int answer = 2;
        Arrays.sort(sides);
        if (sides[2] < sides[0]+sides[1]){
            answer = 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        삼각형의완성조건 S = new 삼각형의완성조건();
        int[] Case1 = {1, 2, 3};
        int[] Case2 = {3, 6, 2};
        int[] Case3 = {199, 72, 222};

        System.out.println(S.solution(Case1));
        System.out.println(S.solution(Case2));
        System.out.println(S.solution(Case3));
    }
}
