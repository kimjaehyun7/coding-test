package programmers;

import java.util.Arrays;

public class Pro_86491 {
    public int solution(int[][] sizes) {
        int answer = 0;

        int[] minArr = new int[sizes.length];
        int[] maxArr = new int[sizes.length];

        int count = 0;
        for (int[] size : sizes) {
            int min = Math.min(size[0], size[1]);
            int max = Math.max(size[0], size[1]);

            minArr[count] = min;
            maxArr[count++] = max;
        }

        int minArrMax = Arrays.stream(minArr).max().getAsInt();
        int maxArrMax = Arrays.stream(maxArr).max().getAsInt();

        answer = minArrMax * maxArrMax;
        return answer;
    }
}
