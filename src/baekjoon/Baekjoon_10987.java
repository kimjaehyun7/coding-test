package baekjoon;

import java.io.*;
import java.util.List;

public class Baekjoon_10987 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Character> list = List.of('a', 'e', 'i', 'o', 'u');
        String s = br.readLine();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (list.contains(c)) {
                count++;
            }
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
