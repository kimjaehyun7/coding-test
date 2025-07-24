package baekjoon;

import java.io.*;
import java.util.ArrayDeque;

public class Baekjoon_24511 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        String[] a = br.readLine().split(" ");
        String[] b = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            if (a[i].equals("0")) { // 스택은 영향을 주지 않기 때문에 스킵가능
                deque.offer(Integer.parseInt(b[i]));
            }
        }

        int m = Integer.parseInt(br.readLine());
        for (String s : br.readLine().split(" ")) { // 위로 쌓고 아래에서 빼내면 -> x0 입력 ~ xn 리턴하는 것과 같은 효과
            deque.offerFirst(Integer.parseInt(s));
            bw.write(deque.pollLast() + " ");
        }


        bw.flush();
        bw.close();
        br.close();

    }
}
