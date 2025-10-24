package baekjoon;

import java.io.*;

public class Baekjoon_17202 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();
        String b = br.readLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            sb.append(a.charAt(i)).append(b.charAt(i));
        }

        String ab = sb.toString();

        while (ab.length() > 2) {
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < ab.length() - 1; i++) {
                int num = (ab.charAt(i) - '0' + ab.charAt(i + 1) - '0') % 10;
                temp.append(num);
            }
            ab = temp.toString();
        }

        bw.write(ab);
        bw.flush();
        bw.close();
        br.close();
    }
}
