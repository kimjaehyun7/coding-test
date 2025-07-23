package baekjoon;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Baekjoon_18258 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> deque = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");

            if (arr[0].equals("push")) {
                deque.offer(Integer.parseInt(arr[1]));
            } else if (arr[0].equals("pop")) {
                if (deque.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(deque.poll() + "\n");
                }
            } else if (arr[0].equals("size")) {
                bw.write(deque.size() + "\n");
            } else if (arr[0].equals("empty")) {
                if (deque.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (arr[0].equals("front")) {
                if (deque.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(deque.peek() + "\n");
                }
            } else if (arr[0].equals("back")) {
                if (deque.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(deque.peekLast() + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
