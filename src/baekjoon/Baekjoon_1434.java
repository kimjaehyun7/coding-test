package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Baekjoon_1434 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        int[] box = new int[Integer.parseInt(split[0])];
        int[] book = new int[Integer.parseInt(split[1])];
        int boxIndex = 0;

        addItem(br, box);
        addItem(br, book);

        for (int i = 0; i < book.length; i++) {
            while (box[boxIndex] < book[i]) { // 책 넣기 불가능
                boxIndex++; // 책을 넣을 수 있는 박스를 찾을 때 까지 boxIndex++
            }
            if (box[boxIndex] >= book[i]) { // 책 넣기
                box[boxIndex] -= book[i];
            }
        }

        int waste = Arrays.stream(box).sum(); // 낭비된 용량
        bw.write(waste+"");

        bw.flush();
        bw.close();
        br.close();

    }

    private static void addItem(BufferedReader br, int[] arr) throws IOException {
        String[] item = br.readLine().split(" ");
        for (int i = 0; i < item.length; i++) {
            arr[i] = Integer.parseInt(item[i]);
        }
    }
}
