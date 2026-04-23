package programmers;

public class Pro_181931 {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;

        int sum = a;

        for (boolean b : included) {
            if (b) {
                answer += sum;
            }
            sum += d;
        }
        return answer;
    }
}
