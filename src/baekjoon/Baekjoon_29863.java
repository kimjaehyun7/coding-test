package baekjoon;

import java.io.*;

public class Baekjoon_29863 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sleep = Integer.parseInt(br.readLine());
        int wakeUp = Integer.parseInt(br.readLine());
        int result;

        if (sleep > 3 && sleep < 24) {
            result = (24 - sleep) + wakeUp;
        } else {
            result = wakeUp - sleep;
        }

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
