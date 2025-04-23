package baekjoon;

import java.io.*;

public class Baekjoon_2920 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        if (split[0].equals("1")) {
            bw.write(check(split,"ascending"));
        } else if (split[0].equals("8")) {
            bw.write(check(split,"descending"));
        } else {
            bw.write("mixed");
        }
        bw.flush();
        bw.close();
        br.close();

    }

    private static String check(String[] split, String str) {
        for (int i = 0; i < 8; i++) {
            int num = str.equals("ascending") ? i + 1 : 8 - i;
            if (Integer.parseInt(split[i]) != num) {
                return "mixed";
            }
        }
        return str;
    }
}
