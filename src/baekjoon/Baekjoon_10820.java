package baekjoon;

import java.io.*;

public class Baekjoon_10820 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while ((s = br.readLine()) != null) {
            int[] arr = new int[4]; // 소문자, 대문자, 숫자, 공백
            for (char c : s.toCharArray()) {
                if (c >= 97 && c <= 122) {
                    arr[0]++;
                } else if (c >= 65 && c <= 90) {
                    arr[1]++;
                } else if (c >= 48 && c <= 57) {
                    arr[2]++;
                } else {
                    arr[3]++;
                }
            }
            for (int i : arr) {
                bw.write(i+" ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
