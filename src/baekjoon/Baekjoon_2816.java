package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_2816 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        boolean kbs1 = false;
        boolean kbs2 = false;
        int current = 0; // 화살표

        for (int i = 0; i < n; i++) {
            list.add(br.readLine());
        }

        while (!kbs1) {
            if (!list.get(current).equals("KBS1")) {
                current++;
                bw.write("1");
            } else {
                for (int i = 0; i < current; i++) {
                    bw.write("4");
                }
                String remove = list.remove(current);
                list.add(0, remove);
                current = 0;
                kbs1 = true;
            }
        }
        while (!kbs2) {
            if (!list.get(current).equals("KBS2")) {
                current++;
                bw.write("1");
            } else {
                for (int i = 0; i < current - 1; i++) {
                    bw.write("4");
                }
                kbs2 = true;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
