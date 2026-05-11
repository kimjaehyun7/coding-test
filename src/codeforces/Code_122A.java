package codeforces;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Code_122A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        List<Integer> lucky = new ArrayList<>();

        for (int i = 4; i < 1000; i++) {
            String s = String.valueOf(i);

            boolean isLucky = true;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) != '4' && s.charAt(j) != '7') {
                    isLucky = false;
                    break;
                }
            }
            if (isLucky) {
                lucky.add(i);
            }
        }

        boolean almostLucky = false;
        for (Integer integer : lucky) {
            if (n % integer == 0) {
                almostLucky = true;
                break;
            }
        }

        if (almostLucky) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }

        bw.flush();
    }
}
