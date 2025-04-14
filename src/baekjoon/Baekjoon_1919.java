package baekjoon;

import java.io.*;

public class Baekjoon_1919 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[26];
        int ans = 0;
        for (char c : br.readLine().toCharArray()) {
            arr[c-'a']++;
        }

        for (char c : br.readLine().toCharArray()) {
            arr[c-'a']--;
        }

        for (int i : arr) {
            ans += Math.abs(i);
        }

        bw.write(ans+"");
        bw.flush();
        bw.close();
        br.close();

    }
}
