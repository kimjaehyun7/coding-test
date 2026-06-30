package codeforces;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Code_1859B {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            List<Integer> list = new ArrayList<>();
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                int m = Integer.parseInt(br.readLine());
                int[] arr = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                Arrays.sort(arr);

                list.add(arr[1]);
                min = Math.min(min, Math.min(arr[0], arr[1]));
            }
            list.sort(Collections.reverseOrder());

            long result = min;
            for (int j = 0; j < n - 1; j++) {
                result += list.get(j);
            }
            bw.write(result + "\n");
        }
        bw.flush();
    }
}
