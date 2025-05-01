package baekjoon;

import java.io.*;

public class Baekjoon_10093 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        long a = Long.parseLong(split[0]);
        long b = Long.parseLong(split[1]);
        int count = 0;
        if (a > b) {
            long temp = a;
            a = b;
            b = temp;
        }
        StringBuilder sb = new StringBuilder();
        for (long i = a + 1; i < b; i++) {
            sb.append(i).append(" ");
            count++;
        }

        bw.write(count+"\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

}
