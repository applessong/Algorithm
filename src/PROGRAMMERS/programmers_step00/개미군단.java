package PROGRAMMERS.programmers_step00;

public class 개미군단 {
    public int solution(int hp) {
        int answer = hp/5;
        int b = hp%5;
        if ( b == 4 || b == 2){
            answer += 2;
        } else if ( b == 3 || b == 1 ) {
            answer++;
        }
        return answer;
    }


    public static void main(String[] args) {
        개미군단 S = new 개미군단();
        int Case1 = 23;
        int Case2 = 24;
        int Case3 = 999;

        System.out.println(S.solution(Case1));
        System.out.println(S.solution(Case2));
        System.out.println(S.solution(Case3));
    }
}
