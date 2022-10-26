package PROGRAMMERS.programmers_step00;

import java.util.Arrays;

public class 최댓값만들기 {

    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length-1]*numbers[numbers.length-2];
    }

    public int solution2(int[] numbers) {
        Arrays.sort(numbers);
        int firstMaxValue = numbers[numbers.length - 1];
        int secondMaxValue = numbers[numbers.length - 2];

        return firstMaxValue * secondMaxValue;
    }       //똑같은 식이지만 변수명 알아보기 쉽게 잘씀 이게바로 클린코드....??

    public static void main(String[] args) {
        최댓값만들기 S = new 최댓값만들기();
        int[] case1 = {1, 2, 3, 4, 5};
        int[] case2 = {0, 31, 24, 10, 1, 9};

        System.out.println(S.solution(case1));
        System.out.println(S.solution(case2));
    }
}
