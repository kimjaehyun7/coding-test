package baekjoon;

import java.io.*;

public class Baekjoon_30402 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        outer:
        for (int i = 0; i < 15; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < 15; j++) {
                switch (s[j]) {
                    case "w":
                        bw.write("chunbae");
                        break outer;
                    case "b":
                        bw.write("nabi");
                        break outer;
                    case "g":
                        bw.write("yeongcheol");
                        break outer;
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
