package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Baekjoon_5576 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> w = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            w.add(Integer.parseInt(br.readLine()));
        }
        w.sort(Comparator.reverseOrder());

        List<Integer> k = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            k.add(Integer.parseInt(br.readLine()));
        }
        k.sort(Comparator.reverseOrder());

        int wSum = w.get(0) + w.get(1) + w.get(2);
        int kSum = k.get(0) + k.get(1) + k.get(2);

        bw.write(wSum + " " + kSum);
        bw.flush();
        bw.close();
        br.close();

    }
}
