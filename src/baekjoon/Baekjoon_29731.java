package baekjoon;

import java.io.*;
import java.util.List;

public class Baekjoon_29731 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<String> list = List.of(
                "Never gonna give you up",
                "Never gonna let you down",
                "Never gonna run around and desert you",
                "Never gonna make you cry",
                "Never gonna say goodbye",
                "Never gonna tell a lie and hurt you",
                "Never gonna stop");

        int n = Integer.parseInt(br.readLine());
        boolean check = true;

        for (int i = 0; i < n; i++) {
            if (!list.contains(br.readLine())) {
                check = false;
                break;
            }
        }

        if (check) {
            bw.write("No");
        } else {
            bw.write("Yes");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
