package baekjoon;

import java.io.*;

public class Baekjoon_17363 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        char[][] paint = new char[N][M];

        for (int i = 0; i < N; i++) {
            char[] arr = br.readLine().toCharArray();
            for (int j = 0; j < M; j++) {
                switch (arr[j]) {
                    case '-':
                        paint[i][j] = '|';
                        break;
                    case '|':
                        paint[i][j] = '-';
                        break;
                    case '/':
                        paint[i][j] = '\\';
                        break;
                    case '\\':
                        paint[i][j] = '/';
                        break;
                    case '^':
                        paint[i][j] = '<';
                        break;
                    case '<':
                        paint[i][j] = 'v';
                        break;
                    case 'v':
                        paint[i][j] = '>';
                        break;
                    case '>':
                        paint[i][j] = '^';
                        break;
                    default:
                        paint[i][j] = arr[j];
                }
            }
        }
        for (int i = M - 1; i >= 0; i--) {
            for (int j = 0; j < N; j++) {
                bw.write(paint[j][i] + "");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
