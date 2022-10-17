package PROGRAMMERS.programmers_step00;

public class 점의위치구하기 {
    int solution(int dot[]) {
        int answer = 0;
        if ( dot[0] > 0 && dot[1] > 0 ) {
            answer = 1;
        } else if ( dot[0] < 0 && dot[1] > 0 ) {
            answer = 2;
        } else if ( dot[0] < 0 && dot[1] < 0 ) {
            answer = 3;
        } else if ( dot[0] > 0 && dot[1] < 0 ) {
            answer = 4;
        }
        return answer;
    }

    public static void main(String[] args) {
        점의위치구하기 S = new 점의위치구하기();
        int[] Case1a = {2, 4};
        int[] Case2a = {-7, 9};

        System.out.println(S.solution(Case1a));
        System.out.println(S.solution(Case2a));
    }
}
