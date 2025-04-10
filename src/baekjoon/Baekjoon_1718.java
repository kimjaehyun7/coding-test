package baekjoon;

import java.io.*;

public class Baekjoon_1718 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] words = br.readLine().toCharArray();
        char[] key = br.readLine().toCharArray();

        for (int i = 0; i < words.length; i++) {
            if (words[i] == ' ') { // 공백이면 넘어가기
                continue;
            }
            int value = words[i] - key[i % key.length];
            if (value <= 0) { // 0이하라면 z로 돌아가기
                value += 26;
            }
            value += 96; // 'a' -> 97 이기 때문에 위에서 계산 된 value 값이 1이라면 96을 더해서 a로 만들기
            words[i] = (char)value;
        }
        for (char word : words) { // 출력
            bw.write(word+"");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
