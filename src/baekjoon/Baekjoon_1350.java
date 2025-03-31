package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baekjoon_1350 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 파일의 개수
        String[] files = br.readLine().split(" "); // 파일들의 크기
        int cluster = Integer.parseInt(br.readLine()); // 클러스터 크기
        long disk = 0; // 사용한 디스크 공간

        for (int i = 0; i < n; i++) {
            int file = Integer.parseInt(files[i]);
            if (file % cluster == 0) { // 파일의 크기가 클러스터에 빈 공간 없이 나누어 떨어지는 경우
                disk += (long) (file / cluster) * cluster;
            } else {
                disk += (long) ((file / cluster) + 1) * cluster; // 빈 공간이 있는 경우
            }
        }

        bw.write(disk+"");
        bw.flush();
        bw.close();
        br.close();

    }
}
