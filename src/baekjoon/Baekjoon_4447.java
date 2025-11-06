package baekjoon;

import java.io.*;

public class Baekjoon_4447 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            String lowerCase = name.toLowerCase();
            int g = 0;
            int b = 0;

            for (char c : lowerCase.toCharArray()) {
                if (c == 'g') {
                    g++;
                }
                if (c == 'b') {
                    b++;
                }
            }
            if (g > b) {
                bw.write(name + " is GOOD\n");
            } else if (b > g) {
                bw.write(name + " is A BADDY\n");
            } else {
                bw.write(name + " is NEUTRAL\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
