package codeforces;

import java.io.*;

public class Code_742A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] nums = {6, 8, 4, 2};

        int n = Integer.parseInt(br.readLine());

        int idx = n % 4;

        int result;
        if (n == 0) {
            result = 1;
        } else {
            result = nums[idx];
        }


        bw.write(result + "");
        bw.flush();
    }
}
