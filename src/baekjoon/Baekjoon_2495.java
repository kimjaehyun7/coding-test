package baekjoon;

import java.io.*;

public class Baekjoon_2495 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 3; i++) {
            char[] arr = br.readLine().toCharArray();
            char current = arr[0];
            int max = 0;
            int count = 1;

            for (int j = 1; j < arr.length; j++) {
                if (arr[j] == current) {
                    count++;
                } else {
                    if (max < count) {
                        max = count;
                    }
                    count = 1;
                }
                current = arr[j];
                if (j == arr.length - 1) {
                    if (max < count) {
                        max = count;
                    }
                }
            }
            bw.write(max + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
