package baekjoon;

import java.io.*;

public class Baekjoon_1357 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        int sum = getReverse(split[0]) + getReverse(split[1]); // 뒤집은 두 수의 합
        int ans = getReverse(String.valueOf(sum)); // 한 번더 뒤집기

        bw.write(ans + "");
        bw.flush();
        bw.close();
        br.close();

    }

    private static int getReverse(String s) {
        StringBuilder sb = new StringBuilder();
        String reversed = sb.append(s).reverse().toString();
        while (reversed.startsWith("0")) { // 앞의 0 제거
            reversed = reversed.substring(1);
        }
        return Integer.parseInt(reversed);
    }
}
