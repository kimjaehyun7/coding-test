package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_1427 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] arr = br.readLine().toCharArray();

        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            bw.write(arr[i]+"");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
