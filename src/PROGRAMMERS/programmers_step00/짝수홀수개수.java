package PROGRAMMERS.programmers_step00;

import java.util.Arrays;

public class 짝수홀수개수 {

    public int[] solution(int[] num_list) {
        int even = 0;
        int odd = 0;
        for ( int i = 0 ; i <= num_list.length-1 ; i++ ) {
            if ( num_list[i] % 2 ==  0){
                even++;
            } else {
                odd++;
            }
        }
        return new int[]{even,odd};
    }

    public int[] solution2(int[] num_list) {
        int even = 0;
        int odd = 0;
        for(int num : num_list){
            if(num %2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        return new int[]{even, odd};
    } //같은 방법이지만 for each문 사용

    public static void main(String[] args) {
        짝수홀수개수 S = new 짝수홀수개수();
        int[] case1 = {1, 2, 3, 4, 5};
        int[] case2 = {1, 3, 5, 7};

        System.out.println(Arrays.toString(S.solution(case1)));
        System.out.println(Arrays.toString(S.solution(case2)));
    }
}
