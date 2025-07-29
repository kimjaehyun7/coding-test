package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_2863 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] ab = br.readLine().split(" ");
        double a = Double.parseDouble(ab[0]);
        double b = Double.parseDouble(ab[1]);
        String[] cd = br.readLine().split(" ");
        double c = Double.parseDouble(cd[0]);
        double d = Double.parseDouble(cd[1]);
        List<Double> list = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            list.add((a / c) + (b / d));
            double temp = d;
            d = b;
            b = a;
            a = c;
            c = temp;
        }

        Double max = list.stream().max(Double::compareTo).get();
        for (int i = 0; i < 4; i++) {
            if (list.get(i).equals(max)) {
                bw.write(i + "");
                break;
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
