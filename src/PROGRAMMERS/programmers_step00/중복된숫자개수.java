package PROGRAMMERS.programmers_step00;

public class 중복된숫자개수 {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int i = 0 ; i <= array.length-1 ; i++){
            if( array[i] == n ){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        중복된숫자개수 S = new 중복된숫자개수();
        int[] Case1a = {1, 1, 2, 3, 4, 5};
        int Case1b = 1;
        int[] Case2a = {0, 2, 3, 4};
        int Case2b = 1;

        System.out.println(S.solution(Case1a,Case1b));
        System.out.println(S.solution(Case2a,Case2b));
    }
}
