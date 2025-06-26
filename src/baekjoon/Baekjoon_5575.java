package baekjoon;

import java.io.*;

public class Baekjoon_5575 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 3; i++) {
            String[] arr = br.readLine().split(" ");

            int startHour = Integer.parseInt(arr[0]);
            int startMin = Integer.parseInt(arr[1]);
            int startSec = Integer.parseInt(arr[2]);
            int startTotal = timeToSec(startHour, startMin, startSec);

            int endHour = Integer.parseInt(arr[3]);
            int endMin = Integer.parseInt(arr[4]);
            int endSec = Integer.parseInt(arr[5]);
            int endTotal = timeToSec(endHour, endMin, endSec);

            int work = endTotal - startTotal;

            bw.write(secToTime(work));
        }
        bw.flush();
        bw.close();
        br.close();
    }

    private static int timeToSec(int hour, int min, int sec) {
        return (hour * 3600) + (min * 60) + sec;
    }

    private static String secToTime(int totalSec) {
        int hour = totalSec / 3600;
        totalSec %= 3600;

        int min = totalSec / 60;
        totalSec %= 60;

        int sec = totalSec;

        return hour + " " + min + " " + sec + "\n";
    }
}
