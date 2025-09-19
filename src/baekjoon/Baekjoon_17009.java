package baekjoon;

import java.io.*;

public class Baekjoon_17009 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int apple = 0;
        int banana = 0;

        for (int i = 3; i >= 1; i--) {
            apple += Integer.parseInt(br.readLine()) * i;
        }
        for (int i = 3; i >= 1; i--) {
            banana += Integer.parseInt(br.readLine()) * i;
        }

        if (apple > banana) {
            bw.write("A");
        } else if (banana > apple) {
            bw.write("B");
        } else {
            bw.write("T");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
