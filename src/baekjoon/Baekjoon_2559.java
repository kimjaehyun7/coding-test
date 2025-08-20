package baekjoon;

import java.io.*;

public class Baekjoon_2559 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        int max = Integer.MIN_VALUE;

        String[] split = br.readLine().split(" ");
        int[] arr = new int[n + 1];
        int[] prefix = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(split[i - 1]);
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int index = k;
        for (int i = 1; i <= n - k + 1; i++) {
            max = Math.max(max, prefix[index++] - prefix[i - 1]);
        }

        bw.write(max + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
