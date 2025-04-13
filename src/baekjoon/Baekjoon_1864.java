package baekjoon;

import java.io.*;
import java.util.Map;

public class Baekjoon_1864 {

    static Map<Character, Integer> map = Map.of(
            '-', 0,
            '\\', 1,
            '(', 2,
            '@', 3,
            '?', 4,
            '>', 5,
            '&', 6,
            '%', 7,
            '/', -1
    );

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while (!(s = br.readLine()).equals("#")) {
            char[] arr = s.toCharArray();
            int dec = 0;

            for (int i = 0; i < arr.length; i++) {
                Integer num = map.get(arr[i]);
                dec += num * (int)Math.pow(8, arr.length - (i+1));
            }
            bw.write(dec+"\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
