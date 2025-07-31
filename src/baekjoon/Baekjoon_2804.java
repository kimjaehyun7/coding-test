package baekjoon;

import java.io.*;

public class Baekjoon_2804 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        String a = arr[0];
        String b = arr[1];

        int locA = 0;
        int locB = 0;
        boolean find = false;

        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    locA = j;
                    locB = i;
                    find = true;
                }
                if (find) {
                    break;
                }
            }
            if (find) {
                break;
            }
        }

        char[][] cross = new char[b.length()][a.length()];

        for (int i = 0; i < b.length(); i++) {
            for (int j = 0; j < a.length(); j++) {
                if (j == locB) {
                    cross[i][j] = b.charAt(i);
                } else if (i == locA) {
                    cross[i][j] = a.charAt(j);
                } else {
                    cross[i][j] = '.';
                }
            }
        }

        for (char[] chars : cross) {
            for (char aChar : chars) {
                bw.write(aChar + "");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
