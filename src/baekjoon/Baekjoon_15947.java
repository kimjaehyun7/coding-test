package baekjoon;

import java.io.*;

public class Baekjoon_15947 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // n-1을 14로 나눈 몫, 나머지
        String[] song = "baby sukhwan tururu turu very cute tururu turu in bed tururu turu baby sukhwan".split(" ");

        int N = Integer.parseInt(br.readLine());

        int M = (N - 1) / 14;
        int K = (N - 1) % 14;

        if (song[K].equals("tururu")) {
            if (M >= 3) {
                bw.write("tu+ru*" + (M + 2));
            } else {
                bw.write("tururu");
                for (int i = 0; i < M; i++) {
                    bw.write("ru");
                }
            }
        } else if (song[K].equals("turu")) {
            if (M >= 4) {
                bw.write("tu+ru*" + (M + 1));
            } else {
                bw.write("turu");
                for (int i = 0; i < M; i++) {
                    bw.write("ru");
                }
            }
        } else {
            bw.write(song[K]);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
