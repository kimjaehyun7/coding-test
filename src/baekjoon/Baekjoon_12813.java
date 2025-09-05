package baekjoon;

import java.io.*;

public class Baekjoon_12813 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();
        String b = br.readLine();

        for (int i = 0; i < 5; i++) {
            StringBuilder sb = new StringBuilder();

            switch (i) {
                case 0:
                    for (int j = 0; j < a.length(); j++) {
                        if (a.charAt(j) == '1' && b.charAt(j) == '1') {
                            sb.append("1");
                        } else {
                            sb.append("0");
                        }
                    }
                    break;
                case 1:
                    for (int j = 0; j < a.length(); j++) {
                        if (a.charAt(j) == '1' || b.charAt(j) == '1') {
                            sb.append("1");
                        } else {
                            sb.append("0");
                        }
                    }
                    break;
                case 2:
                    for (int j = 0; j < a.length(); j++) {
                        if (a.charAt(j) != b.charAt(j)) {
                            sb.append("1");
                        } else {
                            sb.append("0");
                        }
                    }
                    break;
                case 3:
                    for (int j = 0; j < a.length(); j++) {
                        if (a.charAt(j) == '1') {
                            sb.append("0");
                        } else {
                            sb.append("1");
                        }
                    }
                    break;
                case 4:
                    for (int j = 0; j < a.length(); j++) {
                        if (b.charAt(j) == '1') {
                            sb.append("0");
                        } else {
                            sb.append("1");
                        }
                    }
                    break;
            }
            bw.write(sb + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
