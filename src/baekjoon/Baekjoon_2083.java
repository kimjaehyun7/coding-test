package baekjoon;

import java.io.*;

public class Baekjoon_2083 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while (!(s = br.readLine()).startsWith("#")) {
            String[] split = s.split(" ");
            String name = split[0];
            int age = Integer.parseInt(split[1]);
            int weight = Integer.parseInt(split[2]);

            if (age > 17 || weight >= 80) {
                bw.write(name + " Senior\n");
            } else {
                bw.write(name + " Junior\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }

}
