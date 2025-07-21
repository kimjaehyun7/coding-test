package baekjoon;

import java.io.*;

public class Baekjoon_4690 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 2; i <= 100; i++) {
            int a = i * i * i;

            for (int j = 2; j < i; j++) {
                int b = j * j * j;

                for (int k = j; k < i; k++) {
                    int c = k * k * k;

                    for (int l = k; l < i; l++) {
                        int d = l * l * l;

                        if ((b + c + d) == a) {
                            bw.write(String.format("Cube = %d, Triple = (%d,%d,%d)\n", i, j, k, l));
                        }
                    }
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
