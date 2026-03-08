package baekjoon;

import java.io.*;

public class Baekjoon_1629 {

    static long C;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");

        long A = Long.parseLong(s[0]);
        long B = Long.parseLong(s[1]);
        C = Long.parseLong(s[2]);

        long result = pow(A, B);

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }

    public static long pow(long a, long b) {
        if (b == 1) {
            return a % C;
        }

        long half = pow(a, b / 2);

        if (b % 2 == 0) {
            return (half * half) % C;
        } else {
            return ((half * half % C) * a) % C;
        }
    }
}
