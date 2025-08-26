package baekjoon;

import java.io.*;

public class Baekjoon_21964 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String result = br.readLine().substring(n - 5, n);
        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }
}
