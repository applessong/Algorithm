package PROGRAMMERS.programmers_step00;

public class 배열의평균값 {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int i = 0 ; i <= numbers.length-1 ; i++){
            answer += numbers[i];
        }
        answer /= numbers.length;
        return answer;
    }

    public static void main(String[] args) {
        배열의평균값 S = new 배열의평균값();
        int[] Case1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] Case2 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};

        System.out.println(S.solution(Case1));
        System.out.println(S.solution(Case2));
    }
}
