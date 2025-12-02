package baekjoon;

import java.io.*;

public class Baekjoon_11575 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            String X = br.readLine();

            for (int j = 0; j < X.length(); j++) {
                int x = X.charAt(j) - 'A';
                char result = (char) ((a * x + b) % 26 + 'A');
                bw.write(result + "");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
