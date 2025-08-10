package baekjoon;

import java.io.*;

public class Baekjoon_9517 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 210;
        int k = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            int t = Integer.parseInt(arr[0]);
            String ans = arr[1];

            count -= t;
            if (count <= 0) {
                break;
            }
            if (ans.equals("T")) {
                k++;
            }
            if (k == 9) {
                k = 1;
            }
        }

        bw.write(k + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
