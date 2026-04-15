package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_27736 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int a = 0; // 찬
        int b = 0; // 반
        int c = 0; // 기

        for (int i : Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray()) {
            if (i == 1) {
                a++;
            } else if (i == -1) {
                b++;
            } else {
                c++;
            }
        }

        int mid = (N % 2 == 0) ? N / 2 : N / 2 + 1;
        if (c >= mid) {
            bw.write("INVALID");
        } else {
            if (b >= a) {
                bw.write("REJECTED");
            } else {
                bw.write("APPROVED");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
