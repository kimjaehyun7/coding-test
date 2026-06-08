package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_451B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);

        int l = 0, r = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != sorted[i]) {
                l = i + 1;
                break;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != sorted[i]) {
                r = i + 1;
                break;
            }
        }

        if (l == 0 && r == 0) {
            bw.write("yes\n");
            bw.write("1 1");
        } else {
            for (int i = l; i <= (l + r) / 2; i++) {
                int temp = arr[i - 1];
                arr[i - 1] = arr[l + r - i - 1];
                arr[l + r - i - 1] = temp;
            }

            boolean isSorted = true;

            for (int i = 0; i < n; i++) {
                if (arr[i] != sorted[i]) {
                    isSorted = false;
                    break;
                }
            }
            if (isSorted) {
                bw.write("yes\n");
                bw.write(l + " " + r);
            } else {
                bw.write("no");
            }
        }
        bw.flush();
    }
}
