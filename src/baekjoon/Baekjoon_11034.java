package baekjoon;

import java.io.*;

public class Baekjoon_11034 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while ((s = br.readLine()) != null) {
            String[] arr = s.split(" ");

            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = Integer.parseInt(arr[2]);

            int max = Math.max((b - a), (c - b));

            bw.write(max - 1 + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
