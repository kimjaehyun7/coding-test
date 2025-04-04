package baekjoon;

import java.io.*;

public class Baekjoon_1547 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        boolean[] cups = {true,false,false};

        for (int i = 0; i < n; i++) {
            String[] move = br.readLine().split(" ");
            int x = Integer.parseInt(move[0]);
            int y = Integer.parseInt(move[1]);
            boolean temp = cups[x-1];
            cups[x-1] = cups[y-1];
            cups[y-1] = temp;
        }
        for (int i = 0; i < cups.length; i++) {
            if (cups[i]) {
                bw.write((i+1)+"");
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
