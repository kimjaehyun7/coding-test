package baekjoon;

import java.io.*;

public class Baekjoon_5532 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int l = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        int korean = finish(a, c);
        int math = finish(b,d);

        if (korean >= math) {
            bw.write(l - korean + "");
        } else {
            bw.write(l - math + "");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    private static int finish(int n, int m) {
        if (n % m == 0) {
            return n / m;
        }
        return (n / m) + 1;
    }
}
