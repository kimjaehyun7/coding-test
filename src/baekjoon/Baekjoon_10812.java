package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_10812 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }


        for (int q = 0; q < m; q++) {
            String[] split = br.readLine().split(" ");

            int i = Integer.parseInt(split[0]);
            int j = Integer.parseInt(split[1]);
            int k = Integer.parseInt(split[2]);

            for (int l = k; l <= j; l++) {
                Integer remove = list.remove(j - 1);
                list.add(i - 1, remove);
            }

        }

        for (Integer i : list) {
            bw.write(i + " ");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
