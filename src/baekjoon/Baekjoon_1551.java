package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Baekjoon_1551 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int k = Integer.parseInt(split[1]);
        List<Integer> list = new ArrayList<>();

        for (String s : br.readLine().split(",")) {
            list.add(Integer.parseInt(s));
        }

        for (int i = 0; i < k; i++) {
            list = getList(list);
        }

        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                bw.write(list.get(i) + "");
            } else {
                bw.write(list.get(i)+",");
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }

    private static List<Integer> getList(List<Integer> list) { // 크기가 N-1인 수열 만들기
        return IntStream.range(0, list.size() - 1)
                .mapToObj(i -> list.get(i + 1) - list.get(i))
                .collect(Collectors.toList());
    }
}
