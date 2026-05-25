package codeforces;

import java.io.*;
import java.util.Map;

public class Code_514A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] array = br.readLine().toCharArray();

        Map<Character, String> map = Map.of(
                '5', "4",
                '6', "3",
                '7', "2",
                '8', "1",
                '9', "0");

        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            if (i == 0 && c == '9') {
                bw.write("9");
            } else if (map.containsKey(c)) {
                bw.write(map.get(c));
            } else {
                bw.write(c + "");
            }
        }

        bw.flush();
    }
}
