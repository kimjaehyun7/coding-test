package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_2587 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        list.sort(null);

        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }

        bw.write((sum/5) + "\n" + list.get(2));
        bw.flush();
        bw.close();
        br.close();
    }
}
