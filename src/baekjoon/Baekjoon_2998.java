package baekjoon;

import java.io.*;
import java.util.Map;

public class Baekjoon_2998 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, String> map = Map.of(
                "000", "0",
                "001", "1",
                "010", "2",
                "011", "3",
                "100", "4",
                "101", "5",
                "110", "6",
                "111", "7");

        String s = br.readLine();
        while (s.length() % 3 != 0) {
            s = "0" + s;
        }

        for (int i = 0; i < s.length(); i += 3) {
            bw.write(map.get(s.substring(i, i + 3)));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
