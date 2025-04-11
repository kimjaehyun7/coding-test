package baekjoon;

import java.io.*;

public class Baekjoon_1731 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        if (arr[1] % arr[0] == 0) { // 등비 수열
            int num = arr[1] / arr[0];
            int next = arr[arr.length - 1] * num;
            bw.write(next+"");
        } else { // 등차 수열
            int num = arr[1] - arr[0];
            int next = arr[arr.length - 1] + num;
            bw.write(next+"");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}