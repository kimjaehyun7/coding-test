package codeforces;

import java.io.*;

public class Code_489C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sp = br.readLine().split(" ");
        int m = Integer.parseInt(sp[0]);
        int s = Integer.parseInt(sp[1]);

        StringBuilder sb = new StringBuilder();
        int maxRemain = s;

        for (int i = 0; i < m; i++) {
            if (maxRemain >= 9) {
                sb.append("9");
                maxRemain -= 9;
            } else if (maxRemain == 0) {
                sb.append("0");
            } else {
                sb.append(maxRemain);
                maxRemain = 0;
            }
        }

        String max = sb.toString();
        String min = sb.reverse().toString();

        if (maxRemain > 0 || (s == 0 && m != 1)) {
            max = "-1";
            min = "-1";
        } else {
            if (min.charAt(0) == '0') {
                for (int i = 1; i < min.length(); i++) {
                    if (min.charAt(i) >= '1') {
                        String[] split = min.split("");
                        StringBuilder sb1 = new StringBuilder("1");
                        for (int j = 1; j < split.length; j++) {
                            if (i == j) {
                                int num = Integer.parseInt(split[j]) - 1;
                                sb1.append(num);
                            } else {
                                sb1.append(split[j]);
                            }
                        }
                        min = sb1.toString();
                        break;
                    }
                }
            }
        }

        bw.write(min + " " + max);
        bw.flush();
    }
}
