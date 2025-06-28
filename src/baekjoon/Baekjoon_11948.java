package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Baekjoon_11948 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> science = new ArrayList<>();
        List<Integer> history = new ArrayList<>();
        int totalScore = 0;

        for (int i = 0; i < 4; i++) {
            science.add(Integer.parseInt(br.readLine()));
        }
        science.sort(Comparator.reverseOrder());
        for (int i = 0; i < 2; i++) {
            history.add(Integer.parseInt(br.readLine()));
        }
        history.sort(Comparator.reverseOrder());

        for (int i = 0; i < 3; i++) {
            totalScore += science.get(i);
        }
        totalScore += history.get(0);

        bw.write(totalScore + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
