package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_3040 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int sum = Arrays.stream(arr).sum();

        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - (arr[i] + arr[j]) == 100) {
                    for (int a : arr) {
                        if (a == arr[i] || a == arr[j]) {
                            continue;
                        }
                        bw.write(a+"\n");
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
