package baekjoon;

import java.io.*;

public class Baekjoon_1668 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] trophies = new int[n];

        for (int i = 0; i < n; i++) {
            trophies[i] = Integer.parseInt(br.readLine());
        }

        bw.write(left(trophies)+"\n");
        bw.write(right(trophies)+"");
        bw.flush();
        bw.close();
        br.close();

    }

    private static int left(int[] trophies) {
        int count = 0;
        int currentHeight = 0; // 높이

        for (int trophy : trophies) {
            if (currentHeight < trophy) {
                count++;
                currentHeight = trophy;
            }
        }
        return count;
    }

    private static int right(int[] trophies) {
        int count = 0;
        int currentHeight = 0; // 높이

        for (int i = trophies.length-1; i >=0; i--) {
            if (currentHeight < trophies[i]) {
                count++;
                currentHeight = trophies[i];
            }
        }
        return count;
    }

}
