package baekjoon;

import java.io.*;

public class Baekjoon_10797 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int date = Integer.parseInt(br.readLine());
        int count = 0;

        for (String s : br.readLine().split(" ")) {
            int n = Integer.parseInt(s);
            if (date == n) {
                count++;
            }
        }

        bw.write(count+"");
        bw.flush();
        bw.close();
        br.close();

    }
}
