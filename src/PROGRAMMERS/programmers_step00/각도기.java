package PROGRAMMERS.programmers_step00;

public class 각도기 {
    int solution(int angle) {
        int answer = 0;
        if ( angle < 90 ){
            answer = 1;
        } else if ( angle == 90) {
            answer = 2;
        } else if ( angle > 90 && angle < 180) {
            answer = 3;
        } else if ( angle == 180 ){
            answer = 4;
        }
        return answer;
    }

    public static void main(String[] args) {
        각도기 S = new 각도기();

        int case1 = 70;
        int case2 = 91;
        int case3 = 180;
        System.out.println(S.solution(case1));
        System.out.println(S.solution(case2));
        System.out.println(S.solution(case3));
    }
}
