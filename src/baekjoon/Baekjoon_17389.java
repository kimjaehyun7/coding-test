package baekjoon;

import java.io.*;

public class Baekjoon_17389 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        char[] arr = br.readLine().toCharArray();
        int result = 0;
        int bonus = 0;

        for (int i = 1; i <= arr.length; i++) {
            if (arr[i - 1] == 'O') {
                result += i + bonus++;
            } else {
                bonus = 0;
            }
        }
        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
