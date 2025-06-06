package baekjoon;

import java.io.*;

public class Baekjoon_1408 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] currentTime = br.readLine().split(":");
        String[] startTime = br.readLine().split(":");

        int currentSec = timeToSec(currentTime);
        int startSec = timeToSec(startTime);
        int remainSec = startSec - currentSec;
        if (remainSec < 0) {
            remainSec += 86400;
        }

        bw.write(secToTime(remainSec));
        bw.flush();
        bw.close();
        br.close();

    }

    private static int timeToSec(String[] time) {
        int totalSec = 0;
        totalSec += Integer.parseInt(time[0]) * 3600;
        totalSec += Integer.parseInt(time[1]) * 60;
        totalSec += Integer.parseInt(time[2]);
        return totalSec;
    }

    private static String secToTime(int totalSec) {
        int sec = totalSec % 60;
        totalSec /= 60;
        int min = totalSec % 60;
        int hour = totalSec / 60;
        return String.format("%02d:%02d:%02d", hour, min, sec);
    }
}
