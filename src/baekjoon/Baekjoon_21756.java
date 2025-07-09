package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_21756 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        while (list.size() != 1) {
            for (int i = 0; i < list.size(); i++) {
                list.remove(i);
                if (list.size() == 1) {
                    break;
                }
            }
        }
        bw.write(list.get(0) + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
