package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_14425 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int count = 0;

        List<String> list = new ArrayList<>();

        int n = Integer.parseInt(arr[0]);
        for (int i = 0; i < n; i++) {
            list.add(br.readLine());
        }

        int m = Integer.parseInt(arr[1]);
        for (int i = 0; i < m; i++) {
            String target = br.readLine();

            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals(target)) {
                    count++;
                    break;
                }
            }


        }

        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
