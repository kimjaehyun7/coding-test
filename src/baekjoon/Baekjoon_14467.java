package baekjoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Baekjoon_14467 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        Map<Integer, Integer> cowMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            int cow = Integer.parseInt(arr[0]);
            int location = Integer.parseInt(arr[1]);

            if (cowMap.containsKey(cow)) {
                if (cowMap.get(cow) != location) {
                    count++;
                    cowMap.replace(cow, location);
                }
            } else {
                cowMap.put(cow, location);
            }
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
