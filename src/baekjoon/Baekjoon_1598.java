package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_1598 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 두 수 입력 ( 오름차순 정렬 )
        List<Integer> list = new ArrayList<>();
        for (String s : br.readLine().split(" ")) {
            list.add(Integer.parseInt(s));
        }
        list.sort(null);


        bw.write(sum(list)+ "");
        bw.flush();
        bw.close();
        br.close();

    }

    private static int sum(List<Integer> list) {
        int n = list.get(0);
        int m = list.get(1);
        int count = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            for (int j = 0; j < 4; j++) {
                count++;
                if (count == n) {
                    x += i;
                    y += j;
                } else if (count == m) {
                    x -= i;
                    y -= j;
                    return Math.abs(x) + Math.abs(y);
                }
            }
        }
        // 입력 조건이 10000000 이하 이기 때문에
        // 의미 없음 ( 위에서 무조건 반환 됨 )
        return -1;
    }
}
