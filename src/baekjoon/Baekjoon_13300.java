package baekjoon;

import java.io.*;

public class Baekjoon_13300 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] students = new int[2][6];
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int k = Integer.parseInt(split[1]);
        int count = 0;

        for (int i = 0; i < n; i++) {
            String[] info = br.readLine().split(" ");
            int gen = Integer.parseInt(info[0]);
            int grade = Integer.parseInt(info[1]);
            students[gen][grade-1]++;
        }

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                count += (students[i][j] + k - 1) / k;
            }
        }

        bw.write(count+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
