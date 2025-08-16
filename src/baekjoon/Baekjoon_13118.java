package baekjoon;

import java.io.*;

public class Baekjoon_13118 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] p = br.readLine().split(" ");
        int[] people = new int[p.length];
        for (int i = 0; i < p.length; i++) {
            people[i] = Integer.parseInt(p[i]);
        }

        String[] s = br.readLine().split(" ");
        int x = Integer.parseInt(s[0]);

        int crush = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i] == x) {
                crush = i + 1;
            }
        }

        bw.write(crush + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
