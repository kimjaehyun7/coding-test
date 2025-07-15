package baekjoon;

import java.io.*;
import java.util.Map;

public class Baekjoon_27889 {

    static Map<String, String> map = Map.of(
            "NLCS", "North London Collegiate School",
            "BHA", "Branksome Hall Asia",
            "KIS", "Korea International School",
            "SJA", "St. Johnsbury Academy");

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        bw.write(map.get(s));
        bw.flush();
        bw.close();
        br.close();
    }
}
