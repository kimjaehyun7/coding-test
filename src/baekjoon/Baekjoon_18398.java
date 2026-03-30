package baekjoon;

import java.io.*;

public class Baekjoon_18398 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());

            for (int j = 0; j < N; j++) {
                String[] s = br.readLine().split(" ");

                int a = Integer.parseInt(s[0]);
                int b = Integer.parseInt(s[1]);

                int sum = a + b;
                int mul = a * b;

                bw.write(sum + " " + mul + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
