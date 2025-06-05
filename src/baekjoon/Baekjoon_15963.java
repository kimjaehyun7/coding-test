package baekjoon;

import java.io.*;

public class Baekjoon_15963 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        if (arr[0].equals(arr[1])) {
            bw.write("1");
        } else {
            bw.write("0");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
