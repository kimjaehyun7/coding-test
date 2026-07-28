package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_427A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int police = 0;
        int guiltyCount = 0;

        for (int i : arr) {
            if (i == -1) {
                if (police > 0) {
                    police--;
                } else {
                    guiltyCount++;
                }
            } else {
                police += i;
            }
        }

        bw.write(guiltyCount + "");
        bw.flush();
    }
}
