package baekjoon;

import java.io.*;

public class Baekjoon_10833 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int remain = 0;

        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split(" ");
            int students = Integer.parseInt(split[0]);
            int apple = Integer.parseInt(split[1]);

            remain += apple % students;
        }


        bw.write(remain+"");
        bw.flush();
        bw.close();
        br.close();

    }
}
