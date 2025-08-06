package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Baekjoon_10539 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] array = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = array[i] * (i + 1);
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += list.get(j);
            }
            list.add(a - sum);
        }

        for (int i = 0; i < n; i++) {
            bw.write(list.get(i) + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
