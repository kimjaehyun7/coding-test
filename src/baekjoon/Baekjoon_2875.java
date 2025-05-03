package baekjoon;

import java.io.*;

public class Baekjoon_2875 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]); // 여학생
        int m = Integer.parseInt(split[1]); // 남학생
        int k = Integer.parseInt(split[2]); // 인턴쉽에 참여해야하는 인원
        int students; // 총 학생 수
        int count = 0;

        while (n >= 2 && m >= 1) {
            n -= 2;
            m -= 1;
            students = n + m;
            count++;
            if (students < k) {
                count--;
                break;
            } else if (students == k) {
                break;
            }
        }
        bw.write(count+"");
        bw.flush();
        bw.close();
        br.close();

    }
}
