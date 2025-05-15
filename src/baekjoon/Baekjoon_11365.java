package baekjoon;

import java.io.*;

public class Baekjoon_11365 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while (!(s = br.readLine()).equals("END")) {
            StringBuilder sb = new StringBuilder();
            String str = sb.append(s).reverse().toString();
            bw.write(str+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
