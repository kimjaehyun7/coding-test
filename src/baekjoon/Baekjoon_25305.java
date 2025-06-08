package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_25305 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        List<Integer> list = new ArrayList<>();

        int n = Integer.parseInt(split[0]);
        int k = Integer.parseInt(split[1]);

        for (String s : br.readLine().split(" ")) {
            list.add(Integer.parseInt(s));
        }
        list.sort(null);

        bw.write(list.get(n - k) + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
