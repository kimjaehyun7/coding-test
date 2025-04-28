package baekjoon;

import java.io.*;

public class Baekjoon_5585 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = 1000 - Integer.parseInt(br.readLine());
        int[] arr = {500, 100, 50, 10, 5, 1};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            count += n / arr[i];
            n %= arr[i];
        }
        bw.write(count+"");
        bw.flush();
        bw.close();
        br.close();

    }
}
