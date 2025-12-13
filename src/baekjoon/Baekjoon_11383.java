package baekjoon;

import java.io.*;

public class Baekjoon_11383 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            StringBuilder sb = new StringBuilder();
            for (char c : br.readLine().toCharArray()) {
                sb.append(c).append(c);
            }
            arr[i] = sb.toString();
        }

        for (int i = 0; i < N; i++) {
            if (!arr[i].equals(br.readLine())) {
                bw.write("Not ");
                break;
            }
        }
        bw.write("Eyfa");
        bw.flush();
        bw.close();
        br.close();
    }
}
