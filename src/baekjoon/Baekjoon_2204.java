package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Baekjoon_2204 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while (!(s = br.readLine()).equals("0")) {
            int n = Integer.parseInt(s);
            List<String> list = new ArrayList<>();
            Map<String, String> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                String o = br.readLine();
                String lower = o.toLowerCase();
                list.add(lower);
                map.put(lower, o);
            }
            list.sort(String::compareTo);
            bw.write(map.get(list.get(0)) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
