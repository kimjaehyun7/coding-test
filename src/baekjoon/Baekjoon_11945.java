package baekjoon;

import java.io.*;

public class Baekjoon_11945 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(br.readLine()).reverse();
            bw.write(sb + "\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
