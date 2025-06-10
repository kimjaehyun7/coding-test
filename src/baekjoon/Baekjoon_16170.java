package baekjoon;

import java.io.*;
import java.time.LocalDate;

public class Baekjoon_16170 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (String s : LocalDate.now().toString().split("-")) {
            bw.write(s + "\n");
        }

        bw.flush();
        bw.close();
    }
}
