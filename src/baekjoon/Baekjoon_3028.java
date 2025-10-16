package baekjoon;

import java.io.*;

public class Baekjoon_3028 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // A : 1,2 교체 B : 2,3 교체  C : 1,3 교체

        int a = 1;
        int b = 0;
        int c = 0;
        for (char mix : br.readLine().toCharArray()) {
            if (mix == 'A') {
                if (a == 1) {
                    b = 2;
                    a = 0;
                } else if (b == 2) {
                    a = 1;
                    b = 0;
                }
            } else if (mix == 'B') {
                if (b == 2) {
                    c = 3;
                    b = 0;
                } else if (c == 3){
                    b = 2;
                    c = 0;
                }
            } else if (mix == 'C') {
                if (c == 3) {
                    a = 1;
                    c = 0;
                } else if (a == 1){
                    c = 3;
                    a = 0;
                }
            }
        }
        bw.write(Math.max(a, Math.max(b, c)) + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
