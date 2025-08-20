package baekjoon;

import java.io.*;

public class Baekjoon_11054 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;
        int[] arr = new int[n + 1];
        String[] split = br.readLine().split(" ");
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(split[i - 1]);
        }
        int[] lis = new int[n + 1];
        int[] lds = new int[n + 1];

        // 앞에서부터 증가하는 가장 큰 배열 크기
        for (int i = 1; i <= n; i++) {
            lis[i] = 1;
            for (int j = 1; j < i; j++) {
                if (arr[j] < arr[i]) {
                    lis[i] = Math.max(lis[i], lis[j] + 1);
                }
            }
        }

        // 뒤에서부터 증가하는 가장 큰 배열 크기
        for (int i = n; i >= 1; i--) {
            lds[i] = 1;
            for (int j = n; j > i; j--) {
                if (arr[j] < arr[i]) {
                    lds[i] = Math.max(lds[i], lds[j] + 1);
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            max = Math.max(max, lis[i] + lds[i] - 1);
        }
        bw.write(max + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
