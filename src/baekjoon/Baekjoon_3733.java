package baekjoon;

import java.io.*;

public class Baekjoon_3733 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while ((s = br.readLine()) != null) {
            String[] arr = s.split(" ");

            int n = Integer.parseInt(arr[0]);
            int x = Integer.parseInt(arr[1]);

            bw.write((x / (n + 1)) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
