//~~~~~장기주차합니다~~ 아직 내 머리론는 못풀겠음~~~~~//
package PROGRAMMERS.programmers_step01;

import java.util.Arrays;

public class 주차중_K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] cut = new int[10];

        int k = 0;
        for ( int i = 0 ; i <= commands.length-1 ; i++) {

            System.out.println("---------------");
            System.out.println( i + "번째 i 바퀴");
            int start = commands[i][0]-1;
            int end = commands[i][1]-1;
            System.out.println(start);
            System.out.println(end);

            for( int j = start ; j <= end ; j++ ) {

                cut[k] = array[j];
                System.out.println(array[j]);
                System.out.println("k"+k);
                k++;

            }

            System.out.println(Arrays.toString(cut));
        }

        return answer;
    }

    public static void main(String[] args) {
        주차중_K번째수 S = new 주차중_K번째수();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(S.solution(array, commands)));

    }
}

