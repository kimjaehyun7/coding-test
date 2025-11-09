package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_4641 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while (!(s = br.readLine()).equals("-1")) {
            List<Integer> list = new ArrayList<>();
            for (String str : s.split(" ")) {
                if (!str.equals("0")) {
                    list.add(Integer.parseInt(str));
                }
            }

            int count = 0;
            for (Integer i : list) {
                if (list.contains(i * 2)) {
                    count++;
                }
            }

            bw.write(count + "\n");

        }


        bw.flush();
        bw.close();
        br.close();
    }
}
