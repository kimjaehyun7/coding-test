package baekjoon;

import java.io.*;

public class Baekjoon_14909 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        for (String s : br.readLine().split(" ")) {
            int num = Integer.parseInt(s);
            if (num > 0) {
                count++;
            }
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
