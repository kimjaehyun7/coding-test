package baekjoon;

import java.io.*;

public class Baekjoon_10769 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean isNone = true;
        int count = 0;

        char[] arr = br.readLine().toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ':' && i < arr.length - 2) {
                if (arr[i + 1] == '-' && arr[i + 2] == ')') {
                    isNone = false;
                    count++;
                } else if (arr[i + 1] == '-' && arr[i + 2] == '(') {
                    isNone = false;
                    count--;
                }
            }
        }

        if (isNone) {
            bw.write("none");
        } else {
            if (count == 0) {
                bw.write("unsure");
            } else if (count > 0) {
                bw.write("happy");
            } else {
                bw.write("sad");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
