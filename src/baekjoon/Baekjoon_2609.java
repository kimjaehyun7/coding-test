package baekjoon;

import java.io.*;

public class Baekjoon_2609 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);

        int gcd = gcd(a, b);
        int lcm = a * b / gcd(a, b); // 최소 공배수

        bw.write(gcd + "\n" + lcm);
        bw.flush();
        bw.close();
        br.close();

    }

    private static int gcd(int a, int b) { // 최대 공약수
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
