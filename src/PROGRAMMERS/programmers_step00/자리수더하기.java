package PROGRAMMERS.programmers_step00;

public class 자리수더하기 {

    public int solution1(int n) {
        int answer = 0;
        String str = n+"";

        for ( int i = 0 ; i <= str.length()-1 ; i++ ) {
            answer += str.charAt(i)-'0';
        }

        return answer;
    }
    public int solution2(int n) {
        int answer = 0;

        while(n>0){
            answer+=n%10;
            n/=10;
        }

        return answer;
    }

    public static void main(String[] args) {
        자리수더하기 S = new 자리수더하기();
        int a = 1234;
        int b = 930211;

        System.out.println(S.solution1(a));
        System.out.println(S.solution1(b));
        System.out.println(S.solution2(a));
        System.out.println(S.solution2(b));
    }
}
