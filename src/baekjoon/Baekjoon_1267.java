package baekjoon;

import java.io.*;

public class Baekjoon_1267 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] split = br.readLine().split(" ");
        int youngSikBillSum = 0;
        int minSikBillSum = 0;

        for (int i = 0; i < n; i++) {
            int call = Integer.parseInt(split[i]);
            youngSikBillSum += youngSik(call);
            minSikBillSum += minSik(call);
        }

        if (youngSikBillSum < minSikBillSum) { // 영식 요금제가 싸다
            bw.write("Y " + youngSikBillSum);
        } else if (youngSikBillSum > minSikBillSum) { // 민식 요금제가 싸다
            bw.write("M " + minSikBillSum);
        } else { // 같음
            bw.write("Y M " + youngSikBillSum);
        }

        bw.flush();
        bw.close();
        br.close();

    }

    private static int youngSik(int call) {
        int bill = 10; // 기본 요금
        while (call >= 30) {
            bill += 10;
            call -= 30;
        }
        return bill;
    }

    private static int minSik(int call) {
        int bill = 15; // 기본 요금
        while (call >= 60) {
            bill += 15;
            call -= 60;
        }
        return bill;
    }
}
