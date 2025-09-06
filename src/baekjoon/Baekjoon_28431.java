package baekjoon;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Baekjoon_28431 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            int s = Integer.parseInt(br.readLine());
            if (!set.add(s)) {
                set.remove(s);
            }
        }

        Integer result = set.stream().findAny().get();
        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
