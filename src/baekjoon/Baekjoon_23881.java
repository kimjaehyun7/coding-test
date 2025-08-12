package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_23881 {

    static int K;
    static int count = 0;
    static String result = "-1";

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        K = Integer.parseInt(s[1]);
        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        selectSort(arr);
        bw.write(result);
        bw.flush();
        bw.close();
        br.close();

    }

    private static void selectSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int maxIndex = i;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            if (i != maxIndex) {
                int temp = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = temp;
                count++;
                if (count == K) {
                    result = arr[maxIndex] + " " + arr[i];
                    return;
                }
            }
        }
    }
}
