package baekjoon;

import java.io.*;

public class Baekjoon_14581 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        bw.write(":fan::fan::fan:\n" +
                ":fan::" + str + "::fan:\n" +
                ":fan::fan::fan:");


        bw.flush();
        bw.close();
        br.close();
    }
}
