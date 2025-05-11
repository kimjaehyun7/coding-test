package baekjoon;

import java.io.*;

public class Baekjoon_1212 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] binary = {"000", "001", "010", "011", "100", "101", "110", "111"};
        String s = br.readLine();

        if (s.equals("0")) {
            bw.write("0");
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                sb.append(binary[c - '0']);
            }
            String result = sb.toString();
            while (result.startsWith("0")) {
                result = result.substring(1);
            }
            bw.write(result);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
