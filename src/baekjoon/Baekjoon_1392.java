package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baekjoon_1392 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]); // 악보 수
        int q = Integer.parseInt(split[1]); // 질문 수
        List<Integer> music  = new ArrayList<>(); // 악보

        for (int i = 1; i <= n; i++) {
            int b = Integer.parseInt(br.readLine()); // 1번 악보부터 b초로 이루어져있는 악보 생성
            for (int j = 0; j < b; j++) {
                music.add(i);
            }
        }

        for (int i = 0; i < q; i++) {
            int k = Integer.parseInt(br.readLine());
            bw.write(music.get(k)+"\n"); // k초 때 부르는 악보 출력
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
