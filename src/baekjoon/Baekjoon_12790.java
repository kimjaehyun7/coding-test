package baekjoon;

import java.io.*;

public class Baekjoon_12790 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] arr = br.readLine().split(" ");
            int hp = Integer.parseInt(arr[0]) + Integer.parseInt(arr[4]);
            int mp = Integer.parseInt(arr[1]) + Integer.parseInt(arr[5]);
            int ap = Integer.parseInt(arr[2]) + Integer.parseInt(arr[6]);
            int def = Integer.parseInt(arr[3]) + Integer.parseInt(arr[7]);

            if (hp < 1) hp = 1;
            if (mp < 1) mp = 1;
            if (ap < 0) ap = 0;

            int power = hp + (mp * 5) + (ap * 2) + (def * 2);

            bw.write(power + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
