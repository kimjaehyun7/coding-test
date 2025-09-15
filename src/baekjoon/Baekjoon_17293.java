package baekjoon;

import java.io.*;

public class Baekjoon_17293 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = n; i >= 0; i--) {
            if (i == 0) {
                String buy = getBeer(n);
                bw.write("No more bottles of beer on the wall, no more bottles of beer.\n");
                bw.write("Go to the store and buy some more, " + buy + " on the wall.");
                break;
            } else {
                String current = getBeer(i);
                String remain = getBeer(i - 1);
                bw.write(current + " on the wall, " + current + ".\n");
                bw.write("Take one down and pass it around, " + remain + " on the wall.\n");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    private static String getBeer(int i) {
        if (i == 0) return "no more bottles of beer";
        if (i == 1) return "1 bottle of beer";
        return i + " bottles of beer";
    }
}
