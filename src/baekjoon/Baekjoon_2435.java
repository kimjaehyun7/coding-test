package baekjoon;

import java.io.*;

public class Baekjoon_2435 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);
        int sum = 0;
        int max = Integer.MIN_VALUE;

        String[] split = br.readLine().split(" ");
        for (int i = 0; i <= split.length - k; i++) {
            for (int j = i; j < i + k; j++) {
                sum += Integer.parseInt(split[j]);
            }
            max = Math.max(max, sum);
            sum = 0;
        }

        bw.write(max + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
