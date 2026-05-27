package codeforces;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Code_43A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int max = 0;
        String result = "";
        for (String s : map.keySet()) {
            if (map.get(s) > max) {
                max = map.get(s);
                result = s;
            }
        }

        bw.write(result);
        bw.flush();
    }
}
