package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_500A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]); // 칸의 개수
        int t = Integer.parseInt(s[1]); // 도착하고 싶은 칸 번호

        int[] portal = new int[n];

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 0; i < n - 1; i++) {
            portal[i] = arr[i];
        }

        int cur = 0;

        boolean isArrive = false;

        while (cur < t) {
            if (cur == t - 1) {
                isArrive = true;
                break;
            }
            cur += portal[cur];
        }

        if (isArrive) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }
        bw.flush();
    }
}
