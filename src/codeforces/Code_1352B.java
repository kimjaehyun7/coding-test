package codeforces;

import java.io.*;

public class Code_1352B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] s = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);

            int canOdd = n - (k - 1);
            int canEven = n - 2 * (k - 1);

            if (canOdd % 2 != 0 && canOdd > 0) {
                bw.write("YES\n");
                for (int j = 0; j < k - 1; j++) {
                    bw.write("1 ");
                }
                bw.write(canOdd + "");
            } else if (canEven % 2 == 0 && canEven > 0) {
                bw.write("YES\n");
                for (int j = 0; j < k - 1; j++) {
                    bw.write("2 ");
                }
                bw.write(canEven + "");
            } else {
                bw.write("NO");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
