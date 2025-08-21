package baekjoon;

import java.io.*;

public class Baekjoon_16139 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] arr = br.readLine().toCharArray();
        int[][] prefix = new int[arr.length + 1][26];

        for (int i = 1; i <= arr.length; i++) {
            for (int j = 0; j < 26; j++) {
                // 이전 값 복사
                prefix[i][j] = prefix[i - 1][j];
            }
            char c = arr[i - 1];
            prefix[i][c - 'a']++;
        }

        int q = Integer.parseInt(br.readLine());
        for (int i = 0; i < q; i++) {
            String[] s = br.readLine().split(" ");
            char c = s[0].charAt(0);
            int l = Integer.parseInt(s[1]);
            int r = Integer.parseInt(s[2]) + 1;

            int result = prefix[r][c - 'a'] - prefix[l][c - 'a'];
            bw.write(result + "\n");

        }
        bw.flush();
        bw.close();
        br.close();
    }
}
