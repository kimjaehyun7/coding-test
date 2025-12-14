package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_11880 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            long[] arr = Arrays.stream(br.readLine().split(" "))
                    .mapToLong(Long::parseLong)
                    .toArray();
            Arrays.sort(arr);

            long ab = arr[0] + arr[1];
            long c = arr[2];
            long result = (ab * ab) + (c * c);

            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
