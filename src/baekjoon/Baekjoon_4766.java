package baekjoon;

import java.io.*;

public class Baekjoon_4766 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double preTemp = Double.parseDouble(br.readLine());
        String s;
        while (!(s = br.readLine()).equals("999")) {
            double currentTemp = Double.parseDouble(s);
            bw.write(String.format("%.2f", (currentTemp - preTemp)) + "\n");
            preTemp = currentTemp;
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
