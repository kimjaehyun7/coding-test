package codeforces;

import java.io.*;
import java.util.Map;

public class Code_785A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Integer> map = Map.of("Tetrahedron", 4,
                "Cube", 6,
                "Octahedron", 8,
                "Dodecahedron", 12,
                "Icosahedron", 20);

        int n = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 0; i < n; i++) {
            count += map.get(br.readLine());
        }

        bw.write(count + "");
        bw.flush();
    }
}
