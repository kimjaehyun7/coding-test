package baekjoon;

import java.io.*;

public class Baekjoon_14568 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        if (n <= 5) {
            bw.write("0");
        } else {
            for (int i = 2; i <= n; i += 2) { // 택희
                for (int j = 1; j <= n; j++) { // 영훈
                    for (int k = j + 2; k <= n; k++) { // 남규
                        if (i + j + k == n) {
                            count++;
                        }
                    }
                }
            }
            bw.write(count + "");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
