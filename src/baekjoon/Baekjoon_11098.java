package baekjoon;

import java.io.*;

public class Baekjoon_11098 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int p = Integer.parseInt(br.readLine());
            int max = 0;
            String player = null;
            for (int j = 0; j < p; j++) {
                String[] arr = br.readLine().split(" ");
                int price = Integer.parseInt(arr[0]);
                if (max < price) {
                    max = price;
                    player = arr[1];
                }
            }
            bw.write(player + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
