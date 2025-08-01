package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_2959 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = new ArrayList<>();
        for (String s : br.readLine().split(" ")) {
            list.add(Integer.parseInt(s));
        }
        list.sort(null);

        bw.write(list.get(0) * list.get(2) + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
