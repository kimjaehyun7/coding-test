package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_28074 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Character> list = new ArrayList<>(List.of('M', 'O', 'B', 'I', 'S'));
        char[] arr = br.readLine().toCharArray();

        for (char c : arr) {
            list.remove(Character.valueOf(c));
        }

        if (list.isEmpty()) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
