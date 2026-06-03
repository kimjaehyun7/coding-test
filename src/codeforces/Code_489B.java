package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_489B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        int[] arr1 = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Arrays.sort(arr1);

        int count = 0;
        int boy = 0;
        int girl = 0;

        while (boy < n && girl < m) {
            if (Math.abs(arr[boy] - arr1[girl]) <= 1) {
                count++;
                boy++;
                girl++;
            } else if (arr[boy] > arr1[girl]) {
                girl++;
            } else {
                boy++;
            }
        }

        bw.write(count + "");
        bw.flush();
    }
}
