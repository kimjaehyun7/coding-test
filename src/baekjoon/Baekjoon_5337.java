package baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Baekjoon_5337 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(".  .   .\n" +
                "|  | _ | _. _ ._ _  _\n" +
                "|/\\|(/.|(_.(_)[ | )(/.");

        bw.flush();
        bw.close();
    }
}
