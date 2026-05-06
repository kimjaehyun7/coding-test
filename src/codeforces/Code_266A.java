package codeforces;

import java.io.*;

public class Code_266A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int count = 0;
        String cur = "";
        for (String s : br.readLine().split("")) {
            if (s.equals(cur)) {
                count++;
            }
            cur = s;
        }

        bw.write(count + "");
        bw.flush();
    }
}
