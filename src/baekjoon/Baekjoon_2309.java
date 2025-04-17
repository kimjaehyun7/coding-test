package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_2309 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j <= 8; j++) {
                int sum = Arrays.stream(arr).sum() - arr[i] - arr[j];
                if (sum == 100) {
                    for (int h : arr) {
                        if (h == arr[i] || h == arr[j]) {
                            continue;
                        }
                        bw.write(h+"\n");
                    }
                    bw.flush();
                    bw.close();
                    br.close();
                    return;
                }
            }
        }
    }
}
