package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baekjoon_1356 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();
        boolean isTrue = false;

        for (int i = 0; i < n.length() - 1; i++) {
            int firstNum = 1;
            int secNum = 1;
            for (int j = 0; j <= i; j++) { // firstNum
                firstNum *= n.charAt(j) - '0';
            }
            for (int k = i+1; k <n.length(); k++) { // secNum
                secNum *= n.charAt(k) - '0';
            }

            if (firstNum == secNum) {
                isTrue = true;
            }
        }
        if (isTrue) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
