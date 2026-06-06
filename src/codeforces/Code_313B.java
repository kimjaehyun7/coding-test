package codeforces;

import java.io.*;

public class Code_313B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        int m = Integer.parseInt(br.readLine());

        int[] preSum = new int[s.length() + 1];

        char cur = s.charAt(0);
        for (int i = 2; i <= s.length(); i++) {
            char next = s.charAt(i - 1);
            if (cur == next) {
                preSum[i] = preSum[i - 1] + 1;
            } else {
                preSum[i] = preSum[i - 1];
            }
            cur = next;
        }

        for (int i = 0; i < m; i++) {
            String[] sp = br.readLine().split(" ");
            int l = Integer.parseInt(sp[0]);
            int r = Integer.parseInt(sp[1]);
            int result = preSum[r] - preSum[l];
            bw.write(result + "\n");
        }
        bw.flush();
    }
}
