package baekjoon;

import java.io.*;

public class Baekjoon_3449 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String a = br.readLine();
            String b = br.readLine();
            int count = 0;

            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) != b.charAt(j)) {
                    count++;
                }
            }
            bw.write("Hamming distance is " + count + ".\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
