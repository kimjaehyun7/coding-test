package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_327A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isAllOne = true;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (isAllOne && arr[i] == 0) {
                isAllOne = false;
            }
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = -1;
                count++;
            }
        }

        int cur = arr[0];
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            cur = Math.max(arr[i], cur + arr[i]);
            max = Math.max(max, cur);
        }

        int result = 0;
        if (isAllOne) {
            bw.write(n - 1 + "");
        } else {
            result = count + max;
            bw.write(result + "");
        }


        bw.flush();
    }
}
