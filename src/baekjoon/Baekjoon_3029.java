package baekjoon;

import java.io.*;

public class Baekjoon_3029 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] start = br.readLine().split(":");
        String[] end = br.readLine().split(":");

        int startTime = timeToSec(start);
        int endTime = timeToSec(end);
        if (startTime >= endTime) {
            endTime += 86400;
        }
        int result = endTime - startTime;

        bw.write(secToTime(result));
        bw.flush();
        bw.close();
        br.close();
    }

    private static int timeToSec(String[] strings) {
        int total;

        total = Integer.parseInt(strings[0]) * 3600;
        total += Integer.parseInt(strings[1]) * 60;
        total += Integer.parseInt(strings[2]);

        return total;
    }

    private static String secToTime(int total) {
        int hour = total / 3600;
        total %= 3600;

        int min = total / 60;
        total %= 60;

        int sec = total;

        return String.format("%02d:%02d:%02d", hour, min, sec);
    }
}
