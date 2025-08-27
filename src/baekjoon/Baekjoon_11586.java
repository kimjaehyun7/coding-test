package baekjoon;

import java.io.*;

public class Baekjoon_11586 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        int k = Integer.parseInt(br.readLine());

        if (k == 1) {
            for (String s : arr) {
                sb.append(s + "\n");
            }
        } else if (k == 2) { // 좌우 반전
            for (String s : arr) {
                StringBuilder temp = new StringBuilder();
                sb.append(temp.append(s).reverse() + "\n");
            }
        } else { // 상하 반전
            for (int i = n - 1; i >= 0; i--) {
                sb.append(arr[i] + "\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
