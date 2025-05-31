package baekjoon;

import java.io.*;

public class Baekjoon_2506 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int score = 1;
        int result = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i].equals("1")) {
                result += score;
                score++;
            } else {
                score = 1;
            }
        }

        bw.write(result+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
