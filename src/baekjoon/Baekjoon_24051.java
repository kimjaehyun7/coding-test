package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_24051 {

    static int count = 0;
    static int result = -1;
    static int N;
    static int K;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        K = Integer.parseInt(s[1]);

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        sort(arr);

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }

    private static void sort(int[] arr) {
        for (int i = 1; i < N; i++) {
            int loc = i - 1;
            int newItem = arr[i];

            while (loc >= 0 && newItem < arr[loc]) {
                arr[loc + 1] = arr[loc];
                count++;
                if (count == K) {
                    result = arr[loc];
                }
                loc--;
            }
            if (loc + 1 != i) {
                arr[loc + 1] = newItem;
                count++;
                if (count == K) {
                    result = newItem;
                }
            }
        }
    }
}
