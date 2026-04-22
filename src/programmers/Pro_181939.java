package programmers;

public class Pro_181939 {
    public int solution(int a, int b) {
        int answer = 0;

        String sa = String.valueOf(a);
        String sb = String.valueOf(b);

        int ab = Integer.parseInt((sa + sb));
        int ba = Integer.parseInt((sb + sa));

        return answer = Math.max(ab, ba);
    }
}
