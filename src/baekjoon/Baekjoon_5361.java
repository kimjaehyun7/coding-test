package baekjoon;

import java.io.*;
import java.util.List;

public class Baekjoon_5361 {

    static List<Double> parts = List.of(350.34, 230.90, 190.55, 125.30, 180.90);

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            double price = 0.0;
            String[] arr = br.readLine().split(" ");
            for (int j = 0; j < arr.length; j++) {
                price += parts.get(j) * Double.parseDouble(arr[j]);
            }
            bw.write("$" + String.format("%.2f", price) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
