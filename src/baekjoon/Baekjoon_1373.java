package baekjoon;

import java.io.*;

public class Baekjoon_1373 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String biNum = br.readLine();
        int remainder = biNum.length() % 3; // 3자리씩 끊은 후 나머지
        StringBuilder sb = new StringBuilder();

        if (remainder == 1) { // 1자리가 남았을 때 맨 앞자리 수 먼저 계산
            sb.append(biNum.charAt(0) - '0');
            biNum = biNum.substring(1); // 맨 앞자리 떼어내기
        } else if (remainder == 2) { // 2자리가 남았을 때
            sb.append((biNum.charAt(0)-'0')*2 + biNum.charAt(1)-'0');
            biNum = biNum.substring(2); // 맨 앞 2자리 떼어내기
        }

        // 맨 앞자리 * 4 + 두번째 * 2 + 마지막 까지 더해서 sb에 추가
        for (int i = 0; i < biNum.length(); i += 3) {
            sb.append((biNum.charAt(i)-'0')*4 + (biNum.charAt(i+1)-'0')*2 + biNum.charAt(i+2)-'0');
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
