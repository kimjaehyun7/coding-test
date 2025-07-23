package baekjoon;

import java.io.*;
import java.util.Stack;

public class Baekjoon_12789 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int seq = 1;
        Stack<Integer> stack = new Stack<>();

        for (String s : br.readLine().split(" ")) {
            int stu = Integer.parseInt(s);
            while (!stack.isEmpty() && stack.peek() == seq) {
                seq++;
                stack.pop();
            }
            if (stu == seq) {
                seq++;
            } else {
                stack.add(stu);
            }
        }
        while (!stack.isEmpty()) {
            if (stack.pop() == seq) {
                seq++;
            } else {
                break;
            }
        }

        if (stack.isEmpty()) {
            bw.write("Nice");
        } else {
            bw.write("Sad");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
