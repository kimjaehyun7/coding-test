package baekjoon;

import java.io.*;
import java.math.BigInteger;

public class Baekjoon_1284 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

       while (true){
           int widthSum = 0;
           String input = br.readLine();
           if (input.equals("0")) {
               break;
           }
           char[] arr = input.toCharArray();
           for (char c : arr) {
               widthSum += getWidth(c);
           }
           widthSum += 2 + arr.length -1; // 기본 앞,뒤 2cm, 글자 사이 여백 추가
           bw.write(widthSum +"\n");
       }

        bw.flush();
        bw.close();
        br.close();

    }

    private static int getWidth(char c) {
        switch (c) {
            case '0':
                return 4;
            case '1':
                return 2;
            default:
                return 3;
        }
    }
}
