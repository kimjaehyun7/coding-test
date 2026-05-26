package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class Code_1352C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());

            long left = 0;
            long right = n * k;
            long result = 0;

            while (left <= right) {
                long mid = (left + right) / 2;

                long cnt = mid - mid / n;

                if (cnt >= k) {
                    result = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            bw.write(result + "\n");
        }
        bw.flush();
    }
}
