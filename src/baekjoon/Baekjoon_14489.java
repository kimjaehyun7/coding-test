package baekjoon;

import java.io.*;

public class Baekjoon_14489 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int balance = 0;
        for (String s : br.readLine().split(" ")) {
            balance += Integer.parseInt(s);
        }
        int price = Integer.parseInt(br.readLine());

        if (balance >= price * 2) {
            balance -= (price * 2);
        }
        bw.write(balance + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
