package baekjoon;

import java.io.*;

public class Baekjoon_4880 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while (!(s = br.readLine()).equals("0 0 0")) {
            String[] arr = s.split(" ");
            int a1 = Integer.parseInt(arr[0]);
            int a2 = Integer.parseInt(arr[1]);
            int a3 = Integer.parseInt(arr[2]);
            bw.write(check(a1, a2, a3) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    private static String check(int a1, int a2, int a3) {
        if (a2 - a1 == a3 - a2) {
            int a4 = a3 + (a3 - a2);
            return "AP " + a4;
        } else {
            int a4 = a3 * (a3 / a2);
            return "GP " + a4;
        }
    }
}
