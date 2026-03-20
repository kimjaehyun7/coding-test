package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_3273 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int x = Integer.parseInt(br.readLine());

        int result = 0;

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum > x) {
                right--;
            } else if (sum < x) {
                left++;
            } else {
                result++;
                left++;
                right--;
            }
        }

        bw.write(result + "");


        bw.flush();
        bw.close();
        br.close();

    }

}
