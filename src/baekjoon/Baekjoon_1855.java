package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_1855 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());
        String str = br.readLine();
        char[][] arr = new char[str.length() / k][k];
        char[] charArray = str.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < k; j++) {
                    arr[i][j] = charArray[count];
                    count++;
                }
            } else {
                for (int j = k - 1; j >= 0; j--) {
                    arr[i][j] = charArray[count];
                    count++;
                }
            }
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < arr.length; j++) {
                bw.write(arr[j][i]+"");
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }

}
