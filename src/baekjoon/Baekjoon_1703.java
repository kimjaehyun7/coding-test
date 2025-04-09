package baekjoon;

import java.io.*;

public class Baekjoon_1703 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while (!(s = br.readLine()).equals("0")) {
            String[] split = s.split(" ");
            int a = Integer.parseInt(split[0]); // 나무의 나이
            int leaves = 1;
            for (int i = 1; i < split.length; i += 2) {
                int sf = Integer.parseInt(split[i]); // splitting factor
                int cut = Integer.parseInt(split[i+1]); // 가지치기
                leaves *= sf;
                leaves -= cut;
            }
            bw.write(leaves+"\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }

}
