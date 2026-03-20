package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_2470 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        int resultLeft = 0;
        int resultRight = 0;

        int min = Integer.MAX_VALUE;

        while (left < right) {

            int sum = arr[left] + arr[right];
            int abs = Math.abs(sum);

            if (min > abs) {
                min = abs;
                resultLeft = arr[left];
                resultRight = arr[right];
            }

            if (sum > 0) {
                right--;
            } else if (sum < 0) {
                left++;
            } else {
                break;
            }
        }

        bw.write(resultLeft + " " + resultRight);
        bw.flush();
        bw.close();
        br.close();
    }
}
