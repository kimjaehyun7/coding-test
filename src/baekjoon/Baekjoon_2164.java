package baekjoon;

import java.io.*;
import java.util.ArrayDeque;

public class Baekjoon_2164 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        ArrayDeque<Integer> deque = new ArrayDeque<>(); // FIFO

        for (int i = 1; i <= n; i++) {
            deque.offer(i);
        }

        while (deque.size() != 1) {
            deque.poll();
            Integer poll = deque.poll();
            deque.offer(poll);
        }

        bw.write(deque.poll() + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
