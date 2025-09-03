package baekjoon;

import java.io.*;

public class Baekjoon_6763 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int limit = Integer.parseInt(br.readLine());
        int speed = Integer.parseInt(br.readLine());

        if (speed <= limit) {
            bw.write("Congratulations, you are within the speed limit!\n");
        } else {
            int overLimit = speed - limit;
            int fine = 0;
            if (overLimit >= 1 && overLimit <= 20) fine = 100;
            else if (overLimit >= 21 && overLimit <= 30) fine = 270;
            else fine = 500;

            bw.write("You are speeding and your fine is $" + fine + ".");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
