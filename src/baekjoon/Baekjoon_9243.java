package baekjoon;

import java.io.*;

public class Baekjoon_9243 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        char[] a = br.readLine().toCharArray();
        char[] b = br.readLine().toCharArray();

        boolean delete = true;

        if (n % 2 == 0) { // 같아야 삭제 성공
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    delete = false;
                }
            }
        } else { // 달라야 삭제 성공
            for (int i = 0; i < a.length; i++) {
                if (a[i] == b[i]) {
                    delete = false;
                }
            }
        }

        if (delete) {
            bw.write("Deletion succeeded");
        } else {
            bw.write("Deletion failed");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
