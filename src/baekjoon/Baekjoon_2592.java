package baekjoon;

import java.io.*;

public class Baekjoon_2592 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[100];
        int sum = 0;
        int maxValue = 0;
        int maxIndex = 0;

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            sum += num;
            arr[num/10]++;
        }
        bw.write(sum / 10 + "\n");

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }
        }
        bw.write((maxIndex * 10) + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
