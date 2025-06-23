package baekjoon;

import java.io.*;

public class Baekjoon_25238 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        double a = Double.parseDouble(arr[0]);
        double b = Double.parseDouble(arr[1]);

        double result = a * ((100 - b) / 100);

        if (result >= 100) {
            bw.write("0");
        } else {
            bw.write("1");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
