package baekjoon;

import java.io.*;

public class Baekjoon_4344 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split(" ");
            int sum = 0;
            int count = 0;
            int students = Integer.parseInt(split[0]);
            for (int j = 1; j < split.length; j++) {
                sum += Integer.parseInt(split[j]);
            }
            double aver = (double) sum / students;
            for (int j = 0; j < split.length; j++) {
                if (aver < Integer.parseInt(split[j])) {
                    count++;
                }
            }
            double d = (double) count / students * 100;
            bw.write(String.format("%.3f%%\n", d));
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
