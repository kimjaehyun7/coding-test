package baekjoon;

import java.io.*;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class Baekjoon_2346 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            deque.offer(i);
        }
        String[] arr = br.readLine().split(" ");
        for (int i = 0; i < arr.length; i++) {
            map.put(i + 1, Integer.parseInt(arr[i]));
        }

        for (int i = 0; i < n; i++) {
            Integer poll = deque.poll();
            bw.write(poll + " ");
            if (i == n - 1) {
                break;
            }
            Integer value = map.get(poll);

            if (value > 0) {
                for (int j = 0; j < value - 1; j++) {
                    deque.offer(deque.poll());
                }
            } else { // value < 0
                for (int j = 0; j < Math.abs(value); j++) {
                    deque.push(deque.pollLast());
                }
            }

        }
        bw.flush();
        bw.close();
        br.close();
    }
}
