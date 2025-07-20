package baekjoon;

import java.io.*;

public class Baekjoon_10179 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            double price = Double.parseDouble(br.readLine());

            price = price * 0.8;

            String result = String.format("%.2f", price);
            bw.write("$" + result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
