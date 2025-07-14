package baekjoon;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Baekjoon_1269 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int count = 0;

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        for (String s : br.readLine().split(" ")) {
            setA.add(Integer.parseInt(s));
        }
        for (String s : br.readLine().split(" ")) {
            setB.add(Integer.parseInt(s));
        }

        Set<Integer> set = new HashSet<>(setA);
        set.retainAll(setB); //  A 복사본과 b 교집합
        int result = setA.size() + setB.size() - (set.size() * 2);

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
