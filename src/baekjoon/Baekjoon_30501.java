package baekjoon;

import java.io.*;

public class Baekjoon_30501 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String name = br.readLine();

            if (name.contains("S")) {
                bw.write(name);
                break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
