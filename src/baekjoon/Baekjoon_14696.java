package baekjoon;

import java.io.*;

public class Baekjoon_14696 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int[] a = new int[6];
            int[] b = new int[6];

            String[] deckA = br.readLine().split(" ");
            for (int j = 1; j < deckA.length; j++) {
                a[Integer.parseInt(deckA[j])]++;
            }

            String[] deckB = br.readLine().split(" ");
            for (int j = 1; j < deckB.length; j++) {
                b[Integer.parseInt(deckB[j])]++;
            }

            bw.write(game(a, b) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
    private static String game(int[] a, int[] b) {
        for (int i = 5; i >= 1; i--) {
            if (a[i] > b[i]) {
                return "A";
            } else if (a[i] < b[i]) {
                return "B";
            }
        }
        return "D";
    }
}
