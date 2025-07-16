package baekjoon;

import java.io.*;

public class Baekjoon_18301 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        int n1 = Integer.parseInt(arr[0]);
        int n2 = Integer.parseInt(arr[1]);
        int n12 = Integer.parseInt(arr[2]);

        bw.write((n1 + 1) * (n2 + 1) / (n12 + 1) - 1 + "");


        bw.flush();
        bw.close();
        br.close();

    }
}
