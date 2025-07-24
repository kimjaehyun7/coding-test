package baekjoon;

import java.io.*;

public class Baekjoon_20254 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        int ur = Integer.parseInt(arr[0]);
        int tr = Integer.parseInt(arr[1]);
        int uo = Integer.parseInt(arr[2]);
        int to = Integer.parseInt(arr[3]);

        int result = (ur * 56) + (tr * 24) + (uo * 14) + (to * 6);

        bw.write(result + "");


        bw.flush();
        bw.close();
        br.close();

    }
}
