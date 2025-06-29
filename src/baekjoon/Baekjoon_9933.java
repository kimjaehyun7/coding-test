package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_9933 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(br.readLine());
        }

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            String pass = sb.append(list.get(i)).reverse().toString();

            if (list.contains(pass)) {
                int length = pass.length();
                String mid = pass.substring(length / 2, length / 2 + 1);

                bw.write(length + " " + mid);
                break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
