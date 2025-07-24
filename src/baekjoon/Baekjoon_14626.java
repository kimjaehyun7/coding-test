package baekjoon;

import java.io.*;

public class Baekjoon_14626 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] array = br.readLine().toCharArray();

        for (int i = 0; i <= 9; i++) {
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                if (j % 2 == 0) { // 1
                    if (array[j] == '*') {
                        sum += i;
                    } else {
                        sum += array[j] - '0';
                    }
                } else { // 3
                    if (array[j] == '*') {
                        sum += i * 3;
                    } else {
                        sum += (array[j] - '0') * 3;
                    }
                }
            }
            if (sum % 10 == 0) {
                bw.write(i + "");
                break;
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
