package baekjoon;

import java.io.*;

public class Baekjoon_5218 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            bw.write("Distances: ");
            String[] arr = br.readLine().split(" ");
            char[] charArr1 = arr[0].toCharArray();
            char[] charArr2 = arr[1].toCharArray();

            for (int j = 0; j < charArr1.length; j++) {
                int x = charArr1[j] - '@';
                int y = charArr2[j] - '@';

                if (y >= x) {
                    bw.write((y - x) + " ");
                } else {
                    bw.write((y + 26 - x) + " ");
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
