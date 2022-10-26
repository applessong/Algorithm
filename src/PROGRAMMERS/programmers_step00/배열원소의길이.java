package PROGRAMMERS.programmers_step00;

import java.util.Arrays;

public class 배열원소의길이 {

    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int  i = 0 ; i <= strlist.length-1 ; i++){
            answer[i] = strlist[i].length();
        }
        return answer;
    }

    public static void main(String[] args) {
        배열원소의길이 S = new 배열원소의길이();
        int case1 = 10;
        int case2 = 12;
        String listCase1[] = {"We", "are", "the", "world!"};
        String listCase2[] = {"I", "Love", "Programmers."};

        System.out.println(S.solution(listCase1));
        System.out.println(S.solution(listCase2));

        System.out.println(Arrays.toString(S.solution(listCase1)));
        System.out.println(Arrays.toString(S.solution(listCase2)));

    }
}
