package codeforces;

import java.io.*;

public class Code_1030A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        boolean isHard = false;
        for (String s : br.readLine().split(" ")) {
            if (s.equals("1")) {
                isHard = true;
                break;
            }
        }

        if (isHard) {
            bw.write("HARD");
        } else {
            bw.write("EASY");
        }

        bw.flush();
    }
}
