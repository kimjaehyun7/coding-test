package baekjoon;

import java.io.*;

public class Baekjoon_1264 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] arr = {'a', 'e', 'i', 'o', 'u'}; // 모음 배열

        while (true) {
            int count = 0;
            String input = br.readLine().toLowerCase(); // 대소문자 구분하지 않기 위해 전부 소문자 변경
            if (input.equals("#")) { // 프로그램 종료
                break;
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < input.length(); j++) {
                    if (arr[i] == input.charAt(j)) { // 아스키 코드 값으로 비교
                        count++;
                    }
                }
            }
            bw.write(count+"\n");
        }



        bw.flush();
        bw.close();
        br.close();

    }
}
