package baekjoon;

import java.io.*;

public class Baekjoon_6321 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            for (char c : br.readLine().toCharArray()) {
                c = (char) (c + 1);
                if (c == 91) {
                    c = 'A';
                }
                sb.append(c);
            }
            bw.write("String #" + i + "\n");
            bw.write(sb + "\n\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
