package baekjoon;

import java.io.*;

public class Baekjoon_1924 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        int month = Integer.parseInt(split[0]);
        int days = Integer.parseInt(split[1]);


        bw.write(getDay(daySum(month) + days));
        bw.flush();
        bw.close();
        br.close();

    }

    private static String getDay(int n) {
        switch (n % 7) {
            case 0:
                return "SUN";
            case 1:
                return "MON";
            case 2:
                return "TUE";
            case 3:
                return "WED";
            case 4:
                return "THU";
            case 5:
                return "FRI";
            case 6:
                return "SAT";
        }
        return "wrong";
    }

    private static int daySum(int m) {
        switch (m) {
            case 1:
                return 0;
            case 2:
                return 31;
            case 3:
                return 59;
            case 4:
                return 90;
            case 5:
                return 120;
            case 6:
                return 151;
            case 7:
                return 181;
            case 8:
                return 212;
            case 9:
                return 243;
            case 10:
                return 273;
            case 11:
                return 304;
            case 12:
                return 334;
        }
        return -1;
    }
}
