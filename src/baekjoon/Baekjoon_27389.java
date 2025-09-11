package baekjoon;

import java.io.*;

public class Baekjoon_27389 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double n = Double.parseDouble(br.readLine());

        double result = n / 4;

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
