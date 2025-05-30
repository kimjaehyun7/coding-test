package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_10448 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i * (i + 1) / 2 <= 1000; i++) {
            list.add(i * (i + 1) / 2);
        }

        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            if (isTri(list, k)) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }

    private static boolean isTri(List<Integer> list, int k) {

        for (int j = 0; j < list.size(); j++) {
            for (int l = 0; l < list.size(); l++) {
                for (int m = 0; m < list.size(); m++) {
                    if (list.get(j) + list.get(l) + list.get(m) == k) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
