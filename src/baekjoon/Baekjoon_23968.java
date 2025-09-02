package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_23968 {

    static int N;
    static int K;
    static String result = "-1";
    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        K = Integer.parseInt(s[1]);

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        bubbleSort(arr);

        bw.write(result);
        bw.flush();
        bw.close();
        br.close();

    }

    private static void bubbleSort(int[] arr) {
        for (int last = N; last >= 2; last--) {
            for (int i = 0; i < last - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    count++;
                    if (count == K) {
                        result = arr[i] + " " + arr[i + 1];
                    }
                }
            }
        }
    }
}
