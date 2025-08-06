package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_14888 {

    static int N;
    static int[] arr;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String[] op = br.readLine().split(" ");
        int plus = Integer.parseInt(op[0]);
        int minus = Integer.parseInt(op[1]);
        int mul = Integer.parseInt(op[2]);
        int div = Integer.parseInt(op[3]);

        dfs(1, arr[0], plus, minus, mul, div);

        bw.write(max + "\n" + min);


        bw.flush();
        bw.close();
        br.close();

    }

    private static void dfs(int depth, int current, int plus, int minus, int mul, int div) {
        if (depth == N) {
            min = Math.min(min, current);
            max = Math.max(max, current);
        }

        // 더하기, 빼기, 곱하기, 나누기 4가지로 재귀 호출 -> 가지가 4개씩 뻗어나간다.
        if (plus > 0) {
            dfs(depth + 1, current + arr[depth], plus - 1, minus, mul, div);
        }
        if (minus > 0) {
            dfs(depth + 1, current - arr[depth], plus, minus - 1, mul, div);
        }
        if (mul > 0) {
            dfs(depth + 1, current * arr[depth], plus, minus, mul - 1, div);
        }
        if (div > 0) {
            int temp = 0;
            if (current < 0) { // 현재 값이 음수이면 양수로 바꾼 뒤 나누고 다시 음수로 바꾼다.
                temp = -(-current / arr[depth]);
            } else {
                temp = current / arr[depth];
            }
            dfs(depth + 1, temp, plus, minus, mul, div - 1);
        }
    }
}
