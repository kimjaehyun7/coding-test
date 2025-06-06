package baekjoon;

import java.io.*;

public class Baekjoon_28702 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int nextNum = 0;

        for (int i = 3; i >= 1; i--) {
            int num;
            try {
                num = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                continue;
            }
            nextNum = num + i;
        }

        bw.write(getFizzBuzz(nextNum));
        bw.flush();
        bw.close();
        br.close();

    }

    private static String getFizzBuzz(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(num);
        }
    }
}
