package baekjoon;

import java.io.*;

public class Baekjoon_17496 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]); // 여름의 일 수
        int t = Integer.parseInt(arr[1]); // 스타후르츠 자라는데 걸리는 일의 수
        int c = Integer.parseInt(arr[2]); // 스타후르츠 심을 수 있는 칸의 수
        int p = Integer.parseInt(arr[3]);// 스타후르츠 개당 가격

        int result = (n - 1) / t * c * p;

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
