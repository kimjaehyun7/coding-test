package baekjoon;

import java.io.*;

public class Baekjoon_18406 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int front = 0;
        int back = 0;

        char[] arr = br.readLine().toCharArray();

        for (int i = 0; i < arr.length / 2; i++) {
            front += arr[i] - '0';
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            back += arr[i] - '0';
        }

        if (front == back) {
            bw.write("LUCKY");
        } else {
            bw.write("READY");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
