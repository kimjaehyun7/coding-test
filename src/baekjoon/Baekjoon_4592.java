package baekjoon;

import java.io.*;

public class Baekjoon_4592 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while (!(s = br.readLine()).equals("0")) {
            String[] sp = s.split(" ");
            int N = Integer.parseInt(sp[0]);
            int temp = 0;
            for (int i = 1; i <= N; i++) {
                int num = Integer.parseInt(sp[i]);
                if (temp != num) {
                    bw.write(num + " ");
                    temp = num;
                }
            }
            bw.write("$\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
