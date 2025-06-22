package baekjoon;

import java.io.*;

public class Baekjoon_8370 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        int n1 = Integer.parseInt(arr[0]);
        int k1 = Integer.parseInt(arr[1]);
        int n2 = Integer.parseInt(arr[2]);
        int k2 = Integer.parseInt(arr[3]);

        int result = (n1 * k1) + (n2 * k2);

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
