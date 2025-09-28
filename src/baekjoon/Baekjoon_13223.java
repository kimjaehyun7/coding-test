package baekjoon;

import java.io.*;

public class Baekjoon_13223 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(":");
        int curHour = Integer.parseInt(s[0]);
        int curMin = Integer.parseInt(s[1]);
        int curSec = Integer.parseInt(s[2]);
        int curTime = (curHour * 3600) + (curMin * 60) + curSec;

        String[] s1 = br.readLine().split(":");
        int saltHour = Integer.parseInt(s1[0]);
        int saltMin = Integer.parseInt(s1[1]);
        int saltSec = Integer.parseInt(s1[2]);
        int saltTime = (saltHour * 3600) + (saltMin * 60) + saltSec;

        if (saltTime > curTime) {
            int result = saltTime - curTime;
            int resultHour = result / 3600;
            int resultMin = result % 3600 / 60;
            int resultSec = result % 3600 % 60;
            bw.write(String.format("%02d:%02d:%02d", resultHour, resultMin, resultSec));
        } else {
            int result = 86400 - curTime + saltTime;
            int resultHour = result / 3600;
            int resultMin = result % 3600 / 60;
            int resultSec = result % 3600 % 60;
            bw.write(String.format("%02d:%02d:%02d", resultHour, resultMin, resultSec));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
