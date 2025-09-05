package baekjoon;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Baekjoon_5176 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++) {
            String[] s = br.readLine().split(" ");
            int p = Integer.parseInt(s[0]); // 참가자의 수
            int m = Integer.parseInt(s[1]); // 자리의 수
            int count = 0;
            Set<String> set = new HashSet<>();
            for (int j = 0; j < p; j++) {
                if (!set.add(br.readLine())) {
                    count++;
                }
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
