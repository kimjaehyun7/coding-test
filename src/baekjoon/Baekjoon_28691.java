package baekjoon;

import java.io.*;
import java.util.Map;

public class Baekjoon_28691 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, String> map = Map.of(
                "M", "MatKor",
                "W", "WiCys",
                "C", "CyKor",
                "A", "AlKor",
                "$", "$clear");

        String s = br.readLine();

        bw.write(map.get(s));
        bw.flush();
        bw.close();
        br.close();
    }
}
