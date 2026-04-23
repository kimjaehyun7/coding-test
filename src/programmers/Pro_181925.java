package programmers;

public class Pro_181925 {
    public String solution(int[] numLog) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        int cur = numLog[0];

        for (int i = 1; i < numLog.length; i++) {
            int next = numLog[i];

            if (next == cur + 1) {
                sb.append("w");
            } else if (next == cur - 1) {
                sb.append("s");
            } else if (next == cur + 10) {
                sb.append("d");
            } else if (next == cur - 10) {
                sb.append("a");
            }
            cur = next;
        }

        return answer = sb.toString();
    }
}
