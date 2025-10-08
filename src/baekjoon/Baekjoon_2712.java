package baekjoon;

import java.io.*;

public class Baekjoon_2712 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] s = br.readLine().split(" ");

            if (s[1].equals("kg")) {
                double d = Double.parseDouble(s[0]);
                d *= 2.2046;
                String result = String.format("%.4f lb", d);
                bw.write(result + "\n");
            } else if (s[1].equals("lb")) {
                double d = Double.parseDouble(s[0]);
                d *= 0.4536;
                String result = String.format("%.4f kg", d);
                bw.write(result + "\n");
            } else if (s[1].equals("l")) {
                double d = Double.parseDouble(s[0]);
                d *= 0.2642;
                String result = String.format("%.4f g", d);
                bw.write(result + "\n");
            } else if (s[1].equals("g")) {
                double d = Double.parseDouble(s[0]);
                d *= 3.7854;
                String result = String.format("%.4f l", d);
                bw.write(result + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
