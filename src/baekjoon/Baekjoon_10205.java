package baekjoon;

import java.io.*;

public class Baekjoon_10205 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int K = Integer.parseInt(br.readLine());
        int count = 1;

        for (int i = 0; i < K; i++) {
            int h = Integer.parseInt(br.readLine());

            for (char c : br.readLine().toCharArray()) {
                if (c == 'c') {
                    h++;
                } else { // c == 'b'
                    h--;
                    if (h == 0) {
                        break;
                    }
                }
            }

            bw.write("Data Set " + count++ + ":\n");
            bw.write(h + "\n\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
