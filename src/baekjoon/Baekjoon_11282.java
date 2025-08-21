package baekjoon;

import java.io.*;

public class Baekjoon_11282 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        char result = (char) (n + 44031);

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
