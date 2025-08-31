package baekjoon;

import java.io.*;

public class Baekjoon_11549 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        int t = Integer.parseInt(br.readLine());
        for (String s : br.readLine().split(" ")) {
            if (Integer.parseInt(s) == t) {
                count++;
            }
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
