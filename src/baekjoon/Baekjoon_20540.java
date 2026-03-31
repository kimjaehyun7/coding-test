package baekjoon;

import java.io.*;
import java.util.Map;

public class Baekjoon_20540 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, String> map = Map.of(
                "E", "I", "I", "E",
                "S", "N", "N", "S",
                "T", "F", "F", "T",
                "J", "P", "P", "J"
        );

        for (String s : br.readLine().split("")) {
            bw.write(map.get(s));
        }


        bw.flush();
        bw.close();
        br.close();
    }
}
