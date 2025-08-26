package baekjoon;

import java.io.*;

public class Baekjoon_2596 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // A B C D E F G H
        String[] arr = {"000000", "001111", "010011", "011100", "100110", "101001",
                "110101", "111010"};

        int n = Integer.parseInt(br.readLine());
        char[] charArray = br.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int index = i * 6;
            boolean isKnown = false;
            for (int j = 0; j < 8; j++) {
                int diff = 0;
                for (int k = 0; k < 6; k++) {
                    if (charArray[k + index] != arr[j].charAt(k)) {
                        diff++;
                    }
                }
                if (diff == 1 || diff == 0) {
                    isKnown = true;
                    sb.append((char) (j + 65));
                }
            }
            if (!isKnown) {
                sb.delete(0, sb.length()).append(i + 1);
                break;
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
