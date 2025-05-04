package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_30802 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        String[] split = br.readLine().split(" ");
        int t = Integer.parseInt(split[0]);
        int p = Integer.parseInt(split[1]);
        int shirts = 0;
        int pens = 0;
        int pen = 0;

        for (int i : arr) {
            while (i > 0) {
                shirts++;
                i -= t;
            }
        }
        pens = n / p;
        pen = n % p;

        bw.write(shirts+"\n");
        bw.write(pens + " " + pen);
        bw.flush();
        bw.close();
        br.close();
    }
}
