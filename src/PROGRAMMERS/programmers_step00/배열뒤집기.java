package PROGRAMMERS.programmers_step00;

import java.util.Arrays;

public class 배열뒤집기 {
    
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int j = num_list.length-1;
        for ( int i = 0 ; i <= num_list.length-1 ; i++ ){
            answer[i] = num_list[j];
            j--;
        }
        return answer;
    }

    public static void main(String[] args) {
        배열뒤집기 S = new 배열뒤집기();
        int case1 = 10;
        int case2 = 12;
        int listCase1[] = {1, 2, 3, 4, 5};
        int listCase2[] = {1, 1, 1, 1, 1, 2};
        int listCase3[] = {1, 0, 1, 1, 1, 3, 5};

        System.out.println(Arrays.toString(S.solution(listCase1)));
        System.out.println(Arrays.toString(S.solution(listCase2)));
        System.out.println(Arrays.toString(S.solution(listCase3)));

    }
}
