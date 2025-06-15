package baekjoon;

import java.io.*;

public class Baekjoon_11557 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String univ = null;
            int max = 0;
            int m = Integer.parseInt(br.readLine());
            for (int j = 0; j < m; j++) {
                String[] arr = br.readLine().split(" ");
                int l = Integer.parseInt(arr[1]);
                if (max < l) {
                    max = l;
                    univ = arr[0];
                }
            }
            bw.write(univ + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
