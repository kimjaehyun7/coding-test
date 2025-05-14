package baekjoon;

import java.io.*;

public class Baekjoon_7567 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int height = 0;
        char current = 0;
        char[] charArray = br.readLine().toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (i == 0) {
                height += 10;
                current = charArray[0];
                continue;
            }
            if (charArray[i] == current) {
                height += 5;
            } else {
                height += 10;
                current = charArray[i];
            }
        }
        bw.write(height+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
