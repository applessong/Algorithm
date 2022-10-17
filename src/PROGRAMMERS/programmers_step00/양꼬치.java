package PROGRAMMERS.programmers_step00;

public class 양꼬치 {
    int solution(int n, int k) {
        int answer = 12000 * n;

        if ( n/10 < k ) {
            answer += (k - n/10) * 2000;
        }
        return answer;
    }


    public static void main(String[] args) {
        양꼬치 S = new 양꼬치();
        int Case1a = 10;
        int Case1b = 3;
        int Case2a = 64;
        int Case2b = 6;

        System.out.println(S.solution(Case1a,Case1b));
        System.out.println(S.solution(Case2a,Case2b));
    }
}
