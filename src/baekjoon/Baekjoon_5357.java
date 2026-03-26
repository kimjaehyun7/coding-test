package baekjoon;

import java.io.*;

public class Baekjoon_5357 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String pre = "";
            for (String s : br.readLine().split("")) {
                if (!s.equals(pre)) {
                    bw.write(s);
                    pre = s;
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
