package baekjoon;

import java.io.*;

public class Baekjoon_11659 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int[] arr = new int[n + 1];
        int[] prefix = new int[n + 1]; // 누적 합 배열

        String[] split = br.readLine().split(" ");
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(split[i - 1]);
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int k = 0; k < m; k++) {
            String[] sp = br.readLine().split(" ");
            int i = Integer.parseInt(sp[0]);
            int j = Integer.parseInt(sp[1]);

            int sum = prefix[j] - prefix[i - 1];
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
