package baekjoon;

import java.io.*;

public class Baekjoon_25703 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write("int a;\n");
        bw.write("int *ptr = &a;\n");

        String a = "ptr";
        for (int i = 2; i <= n; i++) {
            String b = "ptr" + i;
            for (int j = 0; j < i; j++) {
                b = "*" + b;
            }

            bw.write("int " + b + " = &" + a + ";\n");
            a= b.replaceAll("\\*", "");

        }
        bw.flush();
        bw.close();
        br.close();
    }
}
