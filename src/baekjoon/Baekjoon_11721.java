package baekjoon;

import java.io.*;

public class Baekjoon_11721 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] charArray = br.readLine().toCharArray();
        int count = 0;

        for (char c : charArray) {
            bw.write(c);
            count++;
            if (count % 10 == 0) {
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
