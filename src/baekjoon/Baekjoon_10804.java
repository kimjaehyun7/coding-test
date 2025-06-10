package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_10804 {

    static List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 10; i++) {
            String[] arr = br.readLine().split(" ");
            int a = Integer.parseInt(arr[0]) - 1;
            int b = Integer.parseInt(arr[1]) - 1;
            reverse(a, b);
        }

        for (Integer i : list) {
            bw.write(i + " ");
        }
        bw.flush();
        bw.close();
        br.close();

    }

    private static void reverse(int a, int b) {
        while (a < b) {
            Integer temp = list.set(a, list.get(b));
            list.set(b, temp);
            a++;
            b--;
        }
    }
}
