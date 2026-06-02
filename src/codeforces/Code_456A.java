package codeforces;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Code_456A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            list.add(new int[]{a, b});
        }

        list.sort((a, b) -> (a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]));

        boolean happy = false;
        int curPrice = list.get(0)[0];
        int maxQuality = list.get(0)[1];

        for (int i = 1; i < n; i++) {
            int nextPrice = list.get(i)[0];
            int nextQuality = list.get(i)[1];

            if (nextPrice > curPrice) {
                if (maxQuality > nextQuality) {
                    happy = true;
                    break;
                } else {
                    curPrice = nextPrice;
                    maxQuality = nextQuality;
                }
            } else {
                maxQuality = nextQuality;
            }
        }

        if (happy) {
            bw.write("Happy Alex");
        } else {
            bw.write("Poor Alex");
        }

        bw.flush();
    }
}
