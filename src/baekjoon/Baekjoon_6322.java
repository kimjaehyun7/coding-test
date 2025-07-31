package baekjoon;

import java.io.*;

public class Baekjoon_6322 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 1;
        String s;
        while (!(s = br.readLine()).equals("0 0 0")) {
            String[] arr = s.split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = Integer.parseInt(arr[2]);

            bw.write("Triangle #" + count++ + "\n");
            bw.write(pythagoras(a, b, c));
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static String pythagoras(int a, int b, int c) {
        if (c != -1 && (c <= a || c <= b)) {
            return "Impossible.\n\n";
        }
        if (a == -1) {
            double s = Math.sqrt((c * c) - (b * b));
            return String.format("a = %.3f\n\n", s);
        }
        if (b == -1) {
            double s = Math.sqrt((c * c) - (a * a));
            return String.format("b = %.3f\n\n", s);
        }
        if (c == -1) {
            double s = Math.sqrt((a * a) + (b * b));
            return String.format("c = %.3f\n\n", s);
        }
        return "";
    }
}
