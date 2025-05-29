package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_11328 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            boolean isPossible = true;
            String[] split = br.readLine().split(" ");
            String s1 = split[0];
            String s2 = split[1];
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (s1.length() != s2.length()) {
                bw.write("Impossible\n");
                continue;
            }

            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] != arr2[j]) {
                    isPossible = false;
                    break;
                }
            }
            if (isPossible) {
                bw.write("Possible\n");
            } else {
                bw.write("Impossible\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
