package baekjoon;

import java.io.*;

public class Baekjoon_2475 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        for (String s : br.readLine().split(" ")) {
            int num = Integer.parseInt(s);
            sum += num * num;
        }
        bw.write(sum % 10 + "");


        bw.flush();
        bw.close();
        br.close();

    }
}
