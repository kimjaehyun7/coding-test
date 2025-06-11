package baekjoon;

import java.io.*;

public class Baekjoon_2864 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int min = 0;
        int max = 0;

        String replace = s.replace('5', '6');
        for (String str : replace.split(" ")) {
            max += Integer.parseInt(str);
        }
        String replace2 = s.replace('6', '5');
        for (String str : replace2.split(" ")) {
            min += Integer.parseInt(str);
        }

        bw.write(min + " " + max);
        bw.flush();
        bw.close();
        br.close();

    }
}
