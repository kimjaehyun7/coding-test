package baekjoon;

import java.io.*;

public class Baekjoon_5692 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while (!(s = br.readLine()).equals("0")) {
            long result = 0;

            char[] array = s.toCharArray();
            int num = array.length;

            for (int i = 0; i < array.length; i++) {
                result += (array[i] - '0') * factorial(num);
                num--;
            }
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
    private static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}
