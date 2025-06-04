package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_2605 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        list.add(1);

        String[] split = br.readLine().split(" ");
        for (int i = 1; i < n; i++) {
            int num = Integer.parseInt(split[i]);
            if (i == num) {
                list.add(i + 1);
            } else {
                list.add(num, i + 1);
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            bw.write(list.get(i) + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
