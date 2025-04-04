package baekjoon;

import java.io.*;

public class Baekjoon_1526 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = n; i >= 4; i--) {
            boolean isTrue = true;
            for (char c : String.valueOf(i).toCharArray()) {
                if (c != '4' && c != '7') {
                    isTrue = false;
                }
            }
            if (isTrue) {
                bw.write(i+"");
                break;
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
