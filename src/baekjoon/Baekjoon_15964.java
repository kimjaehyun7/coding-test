package baekjoon;

import java.io.*;

public class Baekjoon_15964 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);

        bw.write(newOperator(a,b)+"");
        bw.flush();
        bw.close();
        br.close();

    }

    private static long newOperator(int a, int b) {
        return (long) (a + b) * (a - b);
    }
}
