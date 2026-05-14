package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_25A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int oddCount = 0;
        int oddIdx = 0;
        int evenCount = 0;
        int evenIdx = 0;

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
                evenIdx = i + 1;
            } else {
                oddCount++;
                oddIdx = i + 1;
            }
        }

        if (evenCount == 1) {
            bw.write(evenIdx + "");
        }
        if (oddCount == 1) {
            bw.write(oddIdx + "");
        }
        bw.flush();
    }
}
