package PROGRAMMERS.programmers_step00;

public class 숫자비교하기 {
    public int solution(int num1, int num2) {
        int answer = (num1 == num2) ? 1 : -1;
        return answer;
    }

    public int solution2(int num1, int num2) {
        int answer = 0;
        if(num1 == num2){
            answer++;
        } else {
            answer--;
        }
        return answer;
    }

    public static void main(String[] args) {
        숫자비교하기 S = new 숫자비교하기();
        int Case1a = 2;
        int Case1b = 3;
        int Case2a = 11;
        int Case2b = 11;

        System.out.println(S.solution(Case1a,Case1b));
        System.out.println(S.solution(Case2a,Case2b));
    }
}
