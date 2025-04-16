package baekjoon;

import java.io.*;

public class Baekjoon_2028 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            String input = br.readLine();
            int num = Integer.parseInt(input);
            int sqrt = num * num;
            int remain = getRemain(input, sqrt);
            if (num == remain) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }


        bw.flush();
        bw.close();
        br.close();

    }

    private static int getRemain(String input, int sqrt) {
        switch (input.length()) {
            case 1:
                return sqrt % 10;
            case 2:
                return sqrt % 100;
            case 3:
                return sqrt % 1000;
            case 4:
                return sqrt % 10000;
        }
        return -1;
    }
}
