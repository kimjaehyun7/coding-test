package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_6840 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        list.sort(null);

        bw.write(list.get(1) + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
