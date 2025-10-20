package baekjoon;

import java.io.*;
import java.util.*;

public class Baekjoon_21918 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]); // 전구의 개수
        int m = Integer.parseInt(s[1]); // 명령어의 개수

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < m; i++) {
            String[] sp = br.readLine().split(" ");
            int a = Integer.parseInt(sp[0]);
            int b = Integer.parseInt(sp[1]);
            int c = Integer.parseInt(sp[2]);

            if (a == 1) {
                arr[b - 1] = c;
            } else if (a == 2) {
                for (int j = b; j <= c; j++) {
                    if (arr[j - 1] == 0) {
                        arr[j - 1] = 1;
                    } else {
                        arr[j - 1] = 0;
                    }
                }
            } else if (a == 3) {
                for (int j = b; j <= c; j++) {
                    arr[j - 1] = 0;
                }
            } else if (a == 4) {
                for (int j = b; j <= c; j++) {
                    arr[j - 1] = 1;
                }
            }
        }

        for (int i : arr) {
            bw.write(i + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
