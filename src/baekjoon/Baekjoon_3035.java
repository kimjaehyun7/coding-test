package baekjoon;

import java.io.*;

public class Baekjoon_3035 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int R = Integer.parseInt(s[0]);
        int C = Integer.parseInt(s[1]);
        int ZR = Integer.parseInt(s[2]);
        int ZC = Integer.parseInt(s[3]);

        char[][] arr = new char[R][C];
        for (int i = 0; i < R; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < ZR; j++) {
                for (int k = 0; k < C; k++) {
                    for (int l = 0; l < ZC; l++) {
                        bw.write(arr[i][k] + "");
                    }
                }
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
