package baekjoon;

import java.io.*;

public class Baekjoon_12840 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sp = br.readLine().split(" ");
        int h = Integer.parseInt(sp[0]);
        int m = Integer.parseInt(sp[1]);
        int s = Integer.parseInt(sp[2]);
        int currentTime = (h * 3600) + (m * 60) + s;

        int q = Integer.parseInt(br.readLine());
        for (int i = 0; i < q; i++) {
            String[] query = br.readLine().split(" ");
            String t = query[0];

            if (t.equals("1")) {
                int c = Integer.parseInt(query[1]);
                currentTime += c;
                if (currentTime >= 86400) {
                    currentTime %= 86400;
                }
            } else if (t.equals("2")) {
                int c = Integer.parseInt(query[1]);
                currentTime -= c;
                if (currentTime < 0) {
                    currentTime = (86400 - Math.abs(currentTime) % 86400) % 86400;
                }
            } else { // 3
                int temp = currentTime;
                int curHour = temp / 3600;
                temp %= 3600;
                int curMin = temp / 60;
                temp %= 60;
                int curSec = temp;
                bw.write(curHour + " " + curMin + " " + curSec + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
