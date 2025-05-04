package baekjoon;

import java.io.*;

public class Baekjoon_31403 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();
        String ab = a + b;

        int num = Integer.parseInt(a) + Integer.parseInt(b) - Integer.parseInt(c);
        int str = Integer.parseInt(ab) - Integer.parseInt(c);

        bw.write(num + "\n" + str);
        bw.flush();
        bw.close();
        br.close();
    }
}
