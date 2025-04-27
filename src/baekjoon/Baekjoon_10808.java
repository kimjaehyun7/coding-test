package baekjoon;

import java.io.*;

public class Baekjoon_10808 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[26];
        for (char c : br.readLine().toCharArray()) {
            arr[c-'a']++;
        }
        for (int i : arr) {
            bw.write(i+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
