package baekjoon;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Baekjoon_25192 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String chat = br.readLine();
            if (chat.equals("ENTER")) {
                set.clear();
                continue;
            }
            if (set.add(chat)) {
                count++;
            }
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
