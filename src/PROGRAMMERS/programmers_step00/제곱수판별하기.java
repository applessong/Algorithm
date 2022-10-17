package PROGRAMMERS.programmers_step00;

public class 제곱수판별하기 {
    public int solution(int n) {
        int answer = 2;
        for ( int i = 0 ; i <= n ; i++ ){
            if(i*i == n){
                answer = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        제곱수판별하기 S = new 제곱수판별하기();
        int Case1 = 144;
        int Case2 = 976;

        System.out.println(S.solution(Case1));
        System.out.println(S.solution(Case2));
    }
}
