package PROGRAMMERS.programmers_step01;

public class 나머지가1이되는수찾기 {
    public int solution1(int n) {
        int answer = 0;
        int num = 0;
        int i = 1;
        while ( i <= n-1 ){
            num = n % i;
            if ( num == 1 ) {
                answer = i;
                break;
            }
            i++;
        }
        return answer;
    }

    public int solution2(int n) {
        int answer = 0;
        for (int i=2; i<n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public int solution3(int n) {
        int answer = 1;

        while(true) {
            if (n%answer==1) break;
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        나머지가1이되는수찾기 S = new 나머지가1이되는수찾기();
        int a = 10;
        int b = 12;

        System.out.println(S.solution1(a));
        System.out.println(S.solution1(b));
    }
}