package baekjoon;

import java.io.*;

public class Baekjoon_18312 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);
        int count = 0;

        for (int i = 0; i <= n; i++) {
            String hour = String.format("%02d", i);
            if (hour.contains(String.valueOf(k))) {
                count += 3600;
                continue;
            }
            for (int j = 0; j < 60; j++) {
                String min = String.format("%02d", j);
                if (min.contains(String.valueOf(k))) {
                    count += 60;
                    continue;
                }
                for (int l = 0; l < 60; l++) {
                    String sec = String.format("%02d", l);
                    if (sec.contains(String.valueOf(k))) {
                        count++;
                    }
                }
            }
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
