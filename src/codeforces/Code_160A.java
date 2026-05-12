package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_160A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = Arrays.stream(arr).sum();
        Arrays.sort(arr);

        int tmp = 0;
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            tmp += arr[i];
            count++;
            if (tmp > (sum / 2)) {
                break;
            }
        }

        bw.write(count + "");
        bw.flush();
    }
}
