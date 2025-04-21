package baekjoon;

import java.io.*;

public class Baekjoon_2577 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[10]; // 0 ~ 9
        int num = 1;
        for (int i = 0; i < 3; i++) {
            num *= Integer.parseInt(br.readLine());
        }
        char[] charArray = String.valueOf(num).toCharArray();
        for (char c : charArray) {
            arr[c-'0']++;
        }
        for (int i : arr) {
            bw.write(i+"\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }

}
