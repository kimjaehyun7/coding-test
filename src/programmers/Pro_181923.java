package programmers;

public class Pro_181923 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer;
        answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            int min = Integer.MAX_VALUE;

            for (int j = s; j <= e; j++) {
                if (arr[j] > k) {
                    min = Math.min(min, arr[j]);
                }
            }
            if (min == Integer.MAX_VALUE) {
                min = -1;
            }
            answer[i] = min;
        }

        return answer;
    }
}
