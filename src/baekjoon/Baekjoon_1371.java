package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Baekjoon_1371 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[26]; // 알파벳 카운트

        String s;
        while ((s = br.readLine()) != null) { // EOF 가 감지되면 반복문 종료
            for (char c : s.toCharArray()) {
                if (c == ' ') {
                    continue;
                }
                arr[c-'a']++;
            }
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) { // 최댓값 찾기
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) { // 가장 많은 글자 찾기
            if (max == arr[i]) {
                bw.write((char)(i+'a')+"");
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
