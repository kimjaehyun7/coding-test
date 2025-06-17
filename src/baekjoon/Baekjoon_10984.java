package baekjoon;

import java.io.*;

public class Baekjoon_10984 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int total = 0;
            double gpa = 0;

            for (int j = 0; j < n; j++) {
                String[] arr = br.readLine().split(" ");
                int c = Integer.parseInt(arr[0]);
                double g = Double.parseDouble(arr[1]);
                total += c;
                gpa += c * g;
            }
            gpa /= total;
            bw.write(total + " " + (double) Math.round(gpa * 10) / 10 + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
