package baekjoon;

import java.io.*;

public class Baekjoon_14720 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int current = 0; // 0:딸기 , 1:초코, 2:바나나

        for (String s : br.readLine().split(" ")) {
            int milk = Integer.parseInt(s);
            if (current == milk) {
                count++;
                current++;
                if (current == 3) {
                    current = 0;
                }
            }
        }
        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
