package programmers;

public class Pro_181924 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};

        for (int i = 0; i < queries.length; i++) {
            int j = queries[i][0];
            int k = queries[i][1];

            int temp = arr[j];
            arr[j] = arr[k];
            arr[k] = temp;
        }

        return answer = arr;
    }
}
