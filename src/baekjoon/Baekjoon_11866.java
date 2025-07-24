package baekjoon;

import java.io.*;
import java.util.ArrayDeque;

public class Baekjoon_11866 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            deque.offer(i);
        }

        bw.write("<");
        while (!deque.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                deque.offer(deque.poll());
            }
            if (deque.size() != 1) {
                bw.write(deque.poll() + ", ");
            } else {
                bw.write(deque.poll() + "");
            }
        }
        bw.write(">");
        bw.flush();
        bw.close();
        br.close();

    }
}
