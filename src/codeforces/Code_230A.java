package codeforces;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Code_230A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sp = br.readLine().split(" ");
        int s = Integer.parseInt(sp[0]); // 초기 키리토 전투력
        int n = Integer.parseInt(sp[1]); // 드래곤 수

        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] sp1 = br.readLine().split(" ");
            int x = Integer.parseInt(sp1[0]); // 드래곤 전투력
            int y = Integer.parseInt(sp1[1]); // 처치 후 얻는 전투력

            list.add(new int[]{x, y});
        }

        list.sort((a, b) -> a[0] - b[0]);

        boolean isWon = true;
        for (int[] ints : list) {
            int x = ints[0];
            int y = ints[1];

            if (s > x) {
                s += y;
            } else {
                isWon = false;
                break;
            }
        }

        if (isWon) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }

        bw.flush();
    }
}
