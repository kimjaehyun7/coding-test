package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_5026 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if (s.equals("P=NP")) {
                bw.write("skipped\n");
                continue;
            }
            int result = 0;
            for (int num : Arrays.stream(s.split("\\+"))
                    .mapToInt(Integer::parseInt)
                    .toArray()) {
                result += num;
            }
            bw.write(result+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
