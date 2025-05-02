package baekjoon;

import java.io.*;

public class Baekjoon_17608 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int height = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > height) {
                height = arr[i];
                count++;
            }
        }

        bw.write(count+"");
        bw.flush();
        bw.close();
        br.close();

    }
}
