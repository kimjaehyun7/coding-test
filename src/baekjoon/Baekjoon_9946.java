package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_9946 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 1;
        outer:
        while (true) {
            String a = br.readLine();
            String b = br.readLine();

            if (a.equals("END") && b.equals("END")) {
                break;
            }

            String[] A = a.split("");
            String[] B = b.split("");

            Arrays.sort(A);
            Arrays.sort(B);

            if (A.length != B.length) {
                bw.write("Case " + count++ + ": different\n");
            } else {
                for (int i = 0; i < A.length; i++) {
                    if (!A[i].equals(B[i])) {
                        bw.write("Case " + count++ + ": different\n");
                        continue outer;
                    }
                }
                bw.write("Case " + count++ + ": same\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
