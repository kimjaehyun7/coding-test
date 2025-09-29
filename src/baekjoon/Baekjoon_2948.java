package baekjoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Baekjoon_2948 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] day = {"Wednesday", "Thursday", "Friday", "Saturday",
                "Sunday", "Monday", "Tuesday"};
        Map<Integer, Integer> month = new HashMap<>();
        month.put(1, 0);
        month.put(2, 31);
        month.put(3, 59);
        month.put(4, 90);
        month.put(5, 120);
        month.put(6, 151);
        month.put(7, 181);
        month.put(8, 212);
        month.put(9, 243);
        month.put(10, 273);
        month.put(11, 304);
        month.put(12, 334);

        String[] s = br.readLine().split(" ");
        int d = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int r = (d + month.get(m)) % 7;

        bw.write(day[r]);
        bw.flush();
        bw.close();
        br.close();
    }
}
