package baekjoon;

import java.io.*;
import java.util.*;

public class Baekjoon_4949 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while (!(s = br.readLine()).equals(".")) {
            Stack<Character> stack = new Stack<>();
            boolean balance = true;

            try {
                for (char c : s.toCharArray()) {
                    if (c == '(') {
                        stack.push(c);
                    } else if (c == ')') {
                        if (stack.pop() != '(') {
                            balance = false;
                            break;
                        }
                    } else if (c == '[') {
                        stack.push(c);
                    } else if (c == ']') {
                        if (stack.pop() != '[') {
                            balance = false;
                            break;
                        }
                    }
                }
            } catch (EmptyStackException e) {
                balance = false;
            }

            if (stack.isEmpty() && balance) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
