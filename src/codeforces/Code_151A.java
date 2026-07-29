package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_151A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = arr[0]; // 친구 수
        int k = arr[1]; // 음료 병 수
        int l = arr[2]; // 한 병에 들어있는 음료의 양
        int c = arr[3]; // 라임 개수
        int d = arr[4]; // 라임 한 개를 자른 조각의 수
        int p = arr[5]; // 소금의 양
        int nl = arr[6]; // 건배 1회에 한 사람이 필요한 음료의 양
        int np = arr[7]; // 건배 1회에 한 사람이 필요한 소금의 양

        int drink = (k * l) / nl;
        int lime = c * d;
        int salt = p / np;

        int count = Math.min(drink, Math.min(lime, salt));

        int result = count / n;

        bw.write(result + "");
        bw.flush();
    }
}
