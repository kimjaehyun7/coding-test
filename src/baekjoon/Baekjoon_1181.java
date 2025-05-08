package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Baekjoon_1181 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }
        String[] arr = new String[set.size()];
        arr = set.toArray(arr);

        Arrays.sort(arr, (s1, s2) -> s1.length() == s2.length() ? s1.compareTo(s2) : Integer.compare(s1.length(), s2.length()));

        for (String s : arr) {
            bw.write(s+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
