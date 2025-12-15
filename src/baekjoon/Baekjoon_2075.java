package baekjoon;

import java.io.*;
import java.util.PriorityQueue;

public class Baekjoon_2075 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            for (String s : br.readLine().split(" ")) {
                int x = Integer.parseInt(s);
                if (pq.size() < N) {
                    pq.offer(x);
                } else if (pq.peek() < x) {
                    pq.poll();
                    pq.offer(x);
                }
            }
        }
        bw.write(pq.peek() + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
