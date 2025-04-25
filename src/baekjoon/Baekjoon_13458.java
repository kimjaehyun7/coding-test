package baekjoon;

import java.io.*;

public class Baekjoon_13458 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 시험장의 개수
        String[] a = br.readLine().split(" ");
        int[] arr = new int[n]; // 응시자
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(a[i]);
        }
        String[] split = br.readLine().split(" ");
        int b = Integer.parseInt(split[0]); // 총감독관 감시 응시자
        int c = Integer.parseInt(split[1]); // 부감독관 감시 응시자

        long sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] -= b;
            sum++;
            if (arr[i] <= 0) {
                continue;
            }
            int num = arr[i] / c;
            if (arr[i] % c == 0) {
                sum += num;
            } else {
                sum += num + 1;
            }
        }

        bw.write(sum+"");
        bw.flush();
        bw.close();
        br.close();

    }

}
