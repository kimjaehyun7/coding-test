package baekjoon;

import java.io.*;

public class Baekjoon_10886 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int cute = 0;
        int not = 0;

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            if (m == 1) {
                cute++;
            } else {
                not++;
            }
        }
        if (cute > not) {
            bw.write("Junhee is cute!");
        } else {
            bw.write("Junhee is not cute!");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
