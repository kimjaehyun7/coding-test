package codeforces;

import java.io.*;

public class Code_466A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]); // 지하철 이용 횟수
        int m = Integer.parseInt(s[1]); // m회 탑승권 횟수
        int a = Integer.parseInt(s[2]); // 1회 탑승권 가격
        int b = Integer.parseInt(s[3]); // m회 탑승권 가격

        if (b > m * a) { // m회 탑승권 가격이 1회 탑승권을 m번 산거보다 비쌀경우
            bw.write((n * a) + "");
        } else {        // m회 탑승권 가격이 1회 탑승권을 m번 산거보다 싸거나 같을 경우
            // 만약 m이 5이고 나머지가 4일때 1회 x 4번보다 m회 탑승권이 쌀 수도 있다.

            int sh = n / m;
            int re = n % m;

            int result = sh * b;

            if (re * a > b) {
                result += b;
            } else {
                result += re * a;
            }
            bw.write(result + "");
        }
        bw.flush();
    }
}
