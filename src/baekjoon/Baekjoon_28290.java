package baekjoon;

import java.io.*;
import java.util.Map;

public class Baekjoon_28290 {

    static Map<String, String> map = Map.of(
            "fdsajkl;", "in-out",
            "jkl;fdsa", "in-out",
            "asdf;lkj", "out-in",
            ";lkjasdf", "out-in",
            "asdfjkl;", "stairs",
            ";lkjfdsa", "reverse");

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        bw.write(map.getOrDefault(s, "molu"));
        bw.flush();
        bw.close();
        br.close();

    }
}
