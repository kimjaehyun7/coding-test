package codeforces;

import java.io.*;

public class Code_59A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int lowerCount = 0;
        int upperCount = 0;

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                lowerCount++;
            } else {
                upperCount++;
            }
        }

        String result;
        if (upperCount > lowerCount) {
            result = s.toUpperCase();
        } else {
            result = s.toLowerCase();
        }

        bw.write(result);
        bw.flush();
    }
}
