package baekjoon;

import java.io.*;

public class Baekjoon_2755 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        double total = 0.0;
        int totalCredit = 0; // 총 학점

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            int credit = Integer.parseInt(arr[1]); // 학점
            totalCredit += credit;

            double grade = grade(arr[2]); // 성적
            total += credit * grade;
        }

        double gpa = total / totalCredit;
        double result = (double) Math.round(gpa * 100) / 100;

        bw.write(String.format("%.2f", result));
        bw.flush();
        bw.close();
        br.close();

    }

    private static double grade(String s) {
        switch (s) {
            case "A+": return 4.3;
            case "A0": return 4.0;
            case "A-": return 3.7;
            case "B+": return 3.3;
            case "B0": return 3.0;
            case "B-": return 2.7;
            case "C+": return 2.3;
            case "C0": return 2.0;
            case "C-": return 1.7;
            case "D+": return 1.3;
            case "D0": return 1.0;
            case "D-": return 0.7;
            case "F": return 0.0;
        }
        return 0.0;
    }
}
