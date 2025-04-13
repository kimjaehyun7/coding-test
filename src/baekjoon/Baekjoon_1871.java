package baekjoon;

import java.io.*;

public class Baekjoon_1871 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split("-");
            char[] charArray = split[0].toCharArray();
            int num1 = 0;
            int num2 = Integer.parseInt(split[1]); // 뒤 4자리 수
            for (int j = 0; j < 3; j++) {
                num1 += (charArray[j] - 'A') * (int)Math.pow(26, charArray.length - (j + 1));
            }
            if (Math.abs(num1 - num2) <= 100) {
                bw.write("nice\n");
            } else {
                bw.write("not nice\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
