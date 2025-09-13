package baekjoon;

import java.io.*;

public class Baekjoon_4388 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while (!(s = br.readLine()).equals("0 0")) {
            String[] sp = s.split(" ");
            String a = sp[0];
            String b = sp[1];
            int count = 0;
            int temp = 0;

            int i = a.length() - 1;
            int j = b.length() - 1;

            while (i >= 0 || j >= 0) {
                int k = i >= 0 ? a.charAt(i--) - '0' : 0;
                int l = j >= 0 ? b.charAt(j--) - '0' : 0;

                int sum = k + l + temp;

                if (sum >= 10) {
                    temp = 1;
                    count++;
                } else {
                    temp = 0;
                }
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
