package baekjoon;

import java.io.*;

public class Baekjoon_28701 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int cubeSum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
            cubeSum += (i * i * i);
        }

        bw.write(sum + "\n");
        bw.write((sum * sum) + "\n");
        bw.write(cubeSum + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
