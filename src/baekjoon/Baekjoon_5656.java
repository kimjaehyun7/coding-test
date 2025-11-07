package baekjoon;

import java.io.*;

public class Baekjoon_5656 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int Case = 1;
        while (true) {
            String[] s = br.readLine().split(" ");
            if (s[1].equals("E")) {
                break;
            }
            int a = Integer.parseInt(s[0]);
            String operator = s[1];
            int b = Integer.parseInt(s[2]);

            boolean result = false;

            switch (operator) {
                case ">":
                    if (a>b) result = true;
                    break;
                case ">=":
                    if (a>=b) result = true;
                    break;
                case "<":
                    if (a<b) result = true;
                    break;
                case "<=":
                    if (a<=b) result = true;
                    break;
                case "==":
                    if (a==b) result = true;
                    break;
                case "!=":
                    if (a!=b) result = true;
                    break;
            }
            bw.write("Case " + Case++ + ": " + result + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
