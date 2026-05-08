package codeforces;

import java.io.*;

public class Code_118A {

    static String gather = "aeiouy";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine().toLowerCase();

        for (String s : str.split("")) {
            if (gather.contains(s)) {
                str = str.replace(s, "");
            }
        }

        for (String s : str.split("")) {
            bw.write("." + s);
        }

        bw.flush();
    }
}
