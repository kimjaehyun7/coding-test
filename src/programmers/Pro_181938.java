package programmers;

public class Pro_181938 {
    public int solution(int a, int b) {
        int answer = 0;

        int ab = Integer.parseInt((
                a + String.valueOf(b)
        ));

        int ab2 = 2 * a * b;

        return answer = Math.max(ab, ab2);
    }
}
