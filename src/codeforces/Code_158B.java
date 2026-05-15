package codeforces;

import java.io.*;
import java.util.Arrays;

public class Code_158B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] taxi = new int[5];


        for (int i : Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray()) {
            taxi[i]++;
        }

        int count = taxi[4];

        if (taxi[3] >= taxi[1]) {
            count += taxi[3];
            taxi[1] = 0;
        } else {
            count += taxi[3];
            taxi[1] -= taxi[3];
        }

        count += taxi[2] / 2;
        taxi[2] -= (taxi[2] / 2) * 2;

        if (taxi[2] == 1) {
            if (taxi[1] >= 2) {
                taxi[1] -= 2;
            } else if (taxi[1] == 1) {
                taxi[1] -= 1;
            }
            count++;
        }

        count += (taxi[1] + 3) / 4;


        bw.write(count + "");
        bw.flush();
    }
}
