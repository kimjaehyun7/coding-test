package baekjoon;

import java.io.*;

public class Baekjoon_2386 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while (!(s = br.readLine()).equals("#")) {
            int count = 0;
            String lowerCase = s.toLowerCase();
            String first = lowerCase.substring(0, 1);
            for (char c : lowerCase.toCharArray()) {
                if (String.valueOf(c).equals(first)) {
                    count++;
                }
            }
            bw.write(first + " " + (count - 1) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
