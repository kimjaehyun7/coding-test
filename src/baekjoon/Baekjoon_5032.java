package baekjoon;

import java.io.*;

public class Baekjoon_5032 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        int e = Integer.parseInt(arr[0]);
        int f = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        int current = e + f;
        int count = 0;

        while (current >= c) {
            current -= c;
            count++;
            current++;
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
