package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_11047 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            Integer v = list.get(i);
            if (k >= v) {
                count += k / v;
                k %= v;
            }
            if (k == 0) {
                break;
            }
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
