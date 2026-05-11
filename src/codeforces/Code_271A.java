package codeforces;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Code_271A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int y = Integer.parseInt(br.readLine());

        while (true) {
            y++;
            String sy = String.valueOf(y);
            Set<String> set = new HashSet<>();
            boolean isBeautiful = true;

            for (String s : sy.split("")) {
                if (!set.add(s)) {
                    isBeautiful = false;
                }
            }

            if (isBeautiful) {
                break;
            }
        }

        bw.write(y + "");
        bw.flush();
    }
}
