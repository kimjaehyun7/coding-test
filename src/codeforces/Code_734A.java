package codeforces;

import java.io.*;

public class Code_734A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int a = 0;
        int d = 0;
        for (String s : br.readLine().split("")) {
            if (s.equals("A")) {
                a++;
            } else {
                d++;
            }
        }

        if (a > d) {
            bw.write("Anton");
        } else if (a < d) {
            bw.write("Danik");
        } else {
            bw.write("Friendship");
        }

        bw.flush();
    }
}
