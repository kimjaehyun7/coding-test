package baekjoon;

import java.io.*;

public class Baekjoon_29751 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        double w = Double.parseDouble(arr[0]);
        double h = Double.parseDouble(arr[1]);

        double result = w * h / 2;

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
