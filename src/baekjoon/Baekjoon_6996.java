package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_6996 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");

            List<String> a = new ArrayList<>();
            List<String> b = new ArrayList<>();

            for (char c : arr[0].toCharArray()) {
                a.add(String.valueOf(c));
            }
            for (char c : arr[1].toCharArray()) {
                b.add(String.valueOf(c));
            }
            a.sort(String::compareTo);
            b.sort(String::compareTo);

            if (a.equals(b)) {
                bw.write(arr[0] + " & " + arr[1] + " are anagrams.\n");
            } else {
                bw.write(arr[0] + " & " + arr[1] + " are NOT anagrams.\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
