package baekjoon;

import java.io.*;

public class Baekjoon_1673 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while ((s = br.readLine()) != null) {
            String[] split = s.split(" ");
            int n = Integer.parseInt(split[0]);
            int k = Integer.parseInt(split[1]);
            int orderSum = n;
            int stamp = n;

            while (stamp >= k) {
                if (stamp % k == 0) {
                    orderSum += stamp / k;
                    if (stamp / k == 1) {
                        break;
                    }
                    stamp /= k;
                } else {
                    orderSum += stamp / k;
                    stamp = stamp / k + stamp % k;
                }
            }
            bw.write(orderSum+"\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
