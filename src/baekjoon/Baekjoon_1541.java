package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_1541 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = new ArrayList<>();
        for (String s : br.readLine().split("-")) {
            int sum = 0;
            for (String string : s.split("\\+")) {
                while (string.startsWith("0")) {
                    string = string.substring(1);
                }
                sum += Integer.parseInt(string);
            }
            list.add(sum);
        }
        int result = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            result -= list.get(i);
        }

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
