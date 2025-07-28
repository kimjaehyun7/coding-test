package baekjoon;

import java.io.*;

public class Baekjoon_1952 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        int m = Integer.parseInt(arr[0]);
        int n = Integer.parseInt(arr[1]);

        /*
        * 행의 수가 열보다 같거나 크면 2 * ( 열의 수 -1 )
        * 행의 수가 열보다 작으면 ( 2 * 행의 수 ) - 1
        * */
        if (n >= m) {
            bw.write(2 * (m - 1) + "");
        } else {
            bw.write(2 * n - 1 + "");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
