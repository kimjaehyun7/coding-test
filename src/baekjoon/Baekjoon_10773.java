package baekjoon;

import java.io.*;

public class Baekjoon_10773 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());
        int sum = 0;
        MyStack stack = new MyStack();

        for (int i = 0; i < k; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                stack.pop();
                continue;
            }
            stack.push(n);
        }

        bw.write(stack.sum() + "");
        bw.flush();
        bw.close();
        br.close();

    }

    static class MyStack {
        int[] arr;
        int top;

        public MyStack() {
            arr = new int[100000];
            top = -1;
        }

        public void push(int n) {
            arr[++top] = n;
        }

        public void pop() {
            top--;
        }

        public int sum() {
            int sum = 0;
            for (int i = 0; i < top + 1; i++) {
                sum += arr[i];
            }
            return sum;
        }
    }
}
