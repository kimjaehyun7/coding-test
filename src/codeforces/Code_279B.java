package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_279B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]); // 책의 수
        int t = Integer.parseInt(s[1]); // 자유 시간

        int max = 0;
        int times = 0;
        int left = 0;

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < arr.length; i++) {
            times += arr[i];

            while (times > t) {
                times -= arr[left++];
            }

            max = Math.max(max, i - left + 1);
        }

        bw.write(max + "");
        bw.flush();
    }
}
