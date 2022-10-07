package PROGRAMMERS.programmers_step00;

import java.util.Arrays;

public class 문자열정렬하기1 {

    public int[] solution(String my_string) {
        String str = "";

        for ( int i = 0 ; i <= my_string.length()-1 ; i++ ) {
            if ( my_string.charAt(i)-'0' <= 9 ) {
                str += my_string.charAt(i);
            }
        }
        String[] strings = str.split("");
        int[] answer = new int[strings.length];

        for ( int i = 0 ; i <= strings.length-1 ; i++ ){
            answer[i] = Integer.parseInt(strings[i]);
        }
        Arrays.sort(answer);
        return answer;
    }

    public int[] solution2(String my_string) {

        StringBuffer str = new StringBuffer(my_string);
        for(int i = my_string.length()-1 ; i >= 0 ; i--){
            if ( my_string.charAt(i)-'0' > 9 ) {
                str.deleteCharAt(i);
            }
        }
        String[] strings = str.toString().split("");
        int[] answer = new int[strings.length];

        for ( int i = 0 ; i <= strings.length-1 ; i++ ){
            answer[i] = Integer.parseInt(strings[i]);
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        문자열정렬하기1 S = new 문자열정렬하기1();
        String case1 = "hi12392";
        String case2 = "p2o4i8gj2";
        String case3 = "abcde0";

        System.out.println(Arrays.toString(S.solution2(case1)));
        System.out.println(Arrays.toString(S.solution2(case2)));
        System.out.println(Arrays.toString(S.solution2(case3)));


    }
}
