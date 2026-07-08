package codeforces;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Code_499B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            String[] sp = br.readLine().split(" ");
            String a = sp[0];
            String b = sp[1];

            if (a.length() > b.length()) {
                map.put(a, b);
            }else {
                map.put(a, a);
            }
        }

        for (String str : br.readLine().split(" ")) {
            bw.write(map.get(str) + " ");
        }
        bw.flush();
    }
}
