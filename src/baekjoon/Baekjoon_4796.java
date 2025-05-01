package baekjoon;

import java.io.*;

public class Baekjoon_4796 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 1;
        while (true) {
            String[] split = br.readLine().split(" ");
            int l = Integer.parseInt(split[0]);
            int p = Integer.parseInt(split[1]);
            int v = Integer.parseInt(split[2]);
            int result = 0;
            if (l + p + v == 0) {
                break;
            }
            result = (v / p) * l;
            v %= p;
            if (v >= l) {
                result += l;
            } else {
                result += v;
            }
            bw.write("Case " + count + ": " + result + "\n");
            count++;
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
