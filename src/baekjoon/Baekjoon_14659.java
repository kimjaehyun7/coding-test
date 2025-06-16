package baekjoon;

import java.io.*;

public class Baekjoon_14659 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int max = 0;
        int kill = 0;
        int current;

        String[] arr = br.readLine().split(" ");

        current = Integer.parseInt(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int height = Integer.parseInt(arr[i]);
            if (current > height) {
                kill++;
            } else {
                if (max < kill) {
                    max = kill;
                }
                kill = 0;
                current = height;
            }
        }
        if (max < kill) {
            max = kill;
        }
        bw.write(max + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
