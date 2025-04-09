package baekjoon;

import java.io.*;

public class Baekjoon_1681 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        String l = split[1];
        int count = 0;

        for (int i = 1; true; i++) {
            String str = String.valueOf(i);
            if (str.contains(l)) {
                continue;
            }
            count++;
            if (count == n) {
                bw.write(str);
                break;
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
