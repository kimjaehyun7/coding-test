package baekjoon;

import java.io.*;
import java.util.*;

public class Baekjoon_2526 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer, Integer> map = new HashMap<>();
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int p = Integer.parseInt(split[1]);
        int current = n;
        int index = 0;

        // 사이클이 한번 돌고
        // current 에 사이클의 처음 숫자가 저장되면
        // 다음 while 문이 실행되지 않는다.
        while (!map.containsKey(current)) {
            map.put(current, index++);
            current = (current * n) % p;
        }

        int result = index - map.get(current);
        bw.write(result+"");
        bw.flush();
        bw.close();
        br.close();

    }
}
