package baekjoon;

import java.io.*;

public class Baekjoon_11283 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result = (int) br.readLine().charAt(0) - 44031;

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
