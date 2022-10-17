package PROGRAMMERS.programmers_step00;

public class 옷가게할인받기 {
    public int solution(int price) {
        int answer = 0;
        if ( price >= 500000 ){
            answer = (int)(price*0.80);
        } else if ( price >= 300000 ){
            answer = (int)(price*0.9);
        } else if ( price >= 100000 ){
            answer = (int)(price*0.95);
        } else {
            answer = price;
        }
        return answer;
    }

    public static void main(String[] args) {
        옷가게할인받기 S = new 옷가게할인받기();
        int Case1 = 150000;
        int Case2 = 580000;

        System.out.println(S.solution(Case1));
        System.out.println(S.solution(Case2));
    }
}
