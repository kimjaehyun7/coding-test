package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_10814 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Member> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String[] split = br.readLine().split(" ");
            list.add(new Member(Integer.parseInt(split[0]), split[1], i));
        }
        list.sort((a, b) -> a.age == b.age ? Integer.compare(a.seq, b.seq) : Integer.compare(a.age, b.age));

        for (Member member : list) {
            bw.write(member + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static class Member {
        private int age;
        private String name;
        private int seq;

        public Member(int age, String name, int seq) {
            this.age = age;
            this.name = name;
            this.seq = seq;
        }

        @Override
        public String toString() {
            return age + " " + name;
        }
    }
}
