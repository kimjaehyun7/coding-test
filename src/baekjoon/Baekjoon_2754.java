package baekjoon;

import java.io.*;

public class Baekjoon_2754 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double[] arr = {4.0, 3.0, 2.0, 1.0};
        double score;

        char[] charArray = br.readLine().toCharArray();
        if (charArray[0] == 'F') {
            bw.write("0.0");
        } else {
            score = arr[charArray[0] - 'A'];
            if (charArray[1] == '+') {
                score += 0.3;
            } else if (charArray[1] == '-') {
                score -= 0.3;
            }
            bw.write(score+"");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
