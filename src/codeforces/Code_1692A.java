package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_1692A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int[] arr = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int a = arr[0];
            Arrays.sort(arr);

            int count = 0;

            for (int j = 1; j <= 4; j++) {
                if (a == arr[j - 1]) {
                    count += 4 - j;
                    break;
                }
            }
            bw.write(count + "\n");
        }
        bw.flush();
    }
}
