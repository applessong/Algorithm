package PROGRAMMERS.programmers_step00;

public class 짝수의합 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 0 ; i <= n ; i++){
            if( i%2 ==0){
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        짝수의합 S = new 짝수의합();
        int Case1 = 10;
        int Case2 = 4;

        System.out.println(S.solution(Case1));
        System.out.println(S.solution(Case2));
    }
}
