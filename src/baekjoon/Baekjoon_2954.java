package baekjoon;

import java.io.*;
import java.util.List;

public class Baekjoon_2954 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Character> vo = List.of('a', 'e', 'i', 'o', 'u');
        char[] arr = br.readLine().toCharArray();

        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + "");
            if (vo.contains(arr[i])) {
                i += 2;
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
