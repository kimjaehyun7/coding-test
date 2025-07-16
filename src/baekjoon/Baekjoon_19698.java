package baekjoon;

import java.io.*;

public class Baekjoon_19698 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        int n = Integer.parseInt(arr[0]); // 소들의 수
        int w = Integer.parseInt(arr[1]); // 너비
        int h = Integer.parseInt(arr[2]); // 높이
        int l = Integer.parseInt(arr[3]); // 소 한마리당 차지하는 공간 ( l * l )

        int result = (w / l) * (h / l);

        if (result > n) {
            result = n;
        }

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();

    }

}
