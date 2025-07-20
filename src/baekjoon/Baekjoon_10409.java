package baekjoon;

import java.io.*;

public class Baekjoon_10409 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        int n = Integer.parseInt(arr[0]);
        int t = Integer.parseInt(arr[1]);
        int count = 0;

        for (String s : br.readLine().split(" ")) {
            t -= Integer.parseInt(s);
            if (t < 0) break;
            count++;
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
