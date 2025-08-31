package baekjoon;

import java.io.*;
import java.util.Map;

public class Baekjoon_30087 {

    static Map<String, String> map = Map.of(
            "Algorithm", "204",
            "DataAnalysis", "207",
            "ArtificialIntelligence", "302",
            "CyberSecurity", "B101",
            "Network", "303",
            "Startup", "501",
            "TestStrategy", "105");

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            bw.write(map.get(br.readLine()) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
