package baekjoon;

import java.io.*;

public class Baekjoon_4101 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String[] split = br.readLine().split(" ");
            int num1 = Integer.parseInt(split[0]);
            int num2 = Integer.parseInt(split[1]);
            if (num1 + num2 == 0) {
                break;
            }
            bw.write(compare(num1, num2));
        }
        bw.flush();
        bw.close();
        br.close();

    }

    private static String compare(int num1, int num2) {
        if (num1 > num2) {
            return "Yes\n";
        }
        return "No\n";
    }
}
