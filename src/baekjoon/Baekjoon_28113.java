package baekjoon;

import java.io.*;
import java.math.BigInteger;

public class Baekjoon_28113 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        int n = Integer.parseInt(arr[0]); // 지하철 승강장까지 걸어가는데 걸리는 시간
        int a = Integer.parseInt(arr[1]); // a 분뒤에 버스 도착
        int b = Integer.parseInt(arr[2]); // b 분뒤에 지하철 도착

        if (n > b) {
            bw.write("Bus");
        } else if (a > b) {
            bw.write("Subway");
        } else if (a < b) {
            bw.write("Bus");
        } else {
            bw.write("Anything");
        }


        bw.flush();
        bw.close();
        br.close();
    }
}
