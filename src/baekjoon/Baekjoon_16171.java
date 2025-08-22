package baekjoon;

import java.io.*;

public class Baekjoon_16171 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String keyword = br.readLine().replaceAll("[0-9]", "");
        String find = br.readLine();
        if (keyword.contains(find)) {
            bw.write("1");
        } else {
            bw.write("0");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
