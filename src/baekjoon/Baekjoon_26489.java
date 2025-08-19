package baekjoon;

import java.io.*;

public class Baekjoon_26489 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        String s;
        while ((s = br.readLine()) != null) {
            count++;
        }

        bw.write(count + "");
        bw.flush();
        br.close();
        bw.close();
    }
}
