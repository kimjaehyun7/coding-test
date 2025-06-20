package baekjoon;

import java.io.*;

public class Baekjoon_2947 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[5];

        String[] split = br.readLine().split(" ");

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                boolean isChanged = false;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isChanged = true;
                }
                if (isChanged) {
                    for (int k = 0; k < 5; k++) {
                        bw.write(arr[k]+" ");
                    }
                    bw.write("\n");

                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
