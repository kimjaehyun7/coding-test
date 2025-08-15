package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_13410 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        int[] arr = new int[k + 1];

        for (int i = 1; i <= k; i++) {
            StringBuilder sb = new StringBuilder();
            arr[i] = Integer.valueOf(sb.append(n * i).reverse().toString());
        }

        bw.write(Arrays.stream(arr).max().getAsInt() + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
