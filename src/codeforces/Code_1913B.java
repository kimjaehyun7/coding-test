package codeforces;

import java.io.*;

public class Code_1913B {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            char[] arr = br.readLine().toCharArray();
            int cnt1 = 0;
            int cnt0 = 0;
            for (char c : arr) {
                if (c == '1') {
                    cnt1++;
                } else {
                    cnt0++;
                }
            }

            int result = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == '1') {
                    if (cnt0 == 0) {
                        result = arr.length - j;
                        break;
                    }
                    cnt0--;
                } else {
                    if (cnt1 == 0) {
                        result = arr.length - j;
                        break;
                    }
                    cnt1--;
                }
            }
            bw.write(result + "\n");
        }
        bw.flush();
    }
}
