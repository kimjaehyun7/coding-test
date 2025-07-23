package baekjoon;

import java.io.*;

public class Baekjoon_2985 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);

        if (a + b == c) {
            bw.write(a + "+" + b + "=" + c);
        } else if (a == b + c) {
            bw.write(a + "=" + b + "+" + c);
        } else if (a - b == c) {
            bw.write(a + "-" + b + "=" + c);
        } else if (a == b - c) {
            bw.write(a + "=" + b + "-" + c);
        } else if (a * b == c) {
            bw.write(a + "*" + b + "=" + c);
        } else if (a == b * c) {
            bw.write(a + "=" + b + "*" + c);
        } else if (a / b == c) {
            bw.write(a + "/" + b + "=" + c);
        } else if (a == b / c) {
            bw.write(a + "=" + b + "/" + c);
        }


        bw.flush();
        bw.close();
        br.close();
    }
}
