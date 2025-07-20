package baekjoon;

import java.io.*;

public class Baekjoon_28278 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        MyStack stack = new MyStack();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            int option = Integer.parseInt(arr[0]);
            switch (option) {
                case 1:
                    int num = Integer.parseInt(arr[1]);
                    stack.push(num);
                    break;
                case 2:
                    bw.write(stack.pop() + "\n");
                    break;
                case 3:
                    bw.write(stack.size() + "\n");
                    break;
                case 4:
                    bw.write(stack.isEmpty() + "\n");
                    break;
                case 5:
                    bw.write(stack.peek() + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }

    static class MyStack {
        private int[] arr;
        private int top;

        public MyStack() {
            arr = new int[1000000];
            top = -1;
        }

        public void push(int n) {
            arr[++top] = n;
        }

        public int pop() {
            return top == -1 ? -1 : arr[top--];
        }

        public int size() {
            return top + 1;
        }

        public int isEmpty() {
            return top == -1 ? 1 : 0;
        }

        public int peek() {
            return top == -1 ? -1 : arr[top];
        }
    }
}
