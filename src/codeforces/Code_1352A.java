package codeforces;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Code_1352A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String s = br.readLine();

            int zeroCount = s.length() - 1;
            List<String> list = new ArrayList<>();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c != '0') {
                    StringBuilder sb = new StringBuilder();
                    sb.append(c);
                    for (int k = 0; k < zeroCount; k++) {
                        sb.append("0");
                    }
                    list.add(sb.toString());
                }
                zeroCount--;
            }
            bw.write(list.size() + "\n");
            for (String string : list) {
                bw.write(string + " ");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
