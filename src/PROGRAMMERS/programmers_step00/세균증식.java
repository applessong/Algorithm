package PROGRAMMERS.programmers_step00;

public class 세균증식 {
    int solution(int n, int t) {
        for ( int i = 1 ; i <= t ; i++ ){
            n *= 2;
        }
        return n;
    }

    public static void main(String[] args) {
        세균증식 S = new 세균증식();
        int Case1a = 2;
        int Case1b = 10;
        int Case2a = 7;
        int Case2b = 15;

        System.out.println(S.solution(Case1a,Case1b));
        System.out.println(S.solution(Case2a,Case2b));
    }
}
