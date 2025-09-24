package baekjoon;

import java.io.*;

public class Baekjoon_13163 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            s[0] = "god";
            for (String string : s) {
                bw.write(string);
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
