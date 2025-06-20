package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_2456 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Member m1 = new Member("1"); // 후보 등록
        Member m2 = new Member("2");
        Member m3 = new Member("3");
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) { // 투표
            String[] arr = br.readLine().split(" ");
            m1.vote(arr[0]);
            m2.vote(arr[1]);
            m3.vote(arr[2]);
        }
        List<Member> members = new ArrayList<>(List.of(m1, m2, m3));
        members.sort((a, b) -> { // 총 점수, 3점,2점,1점 많은 순 정렬
            int compare = Integer.compare(b.totalScore(), a.totalScore());
            if (compare != 0) return compare;

            compare = Integer.compare(b.three, a.three);
            if (compare != 0) return compare;

            compare = Integer.compare(b.two, a.two);
            if (compare != 0) return compare;

            return Integer.compare(b.one, a.one);
        });

        Member first = members.get(0);
        Member second = members.get(1);

        if (first.totalScore() == second.totalScore() && // 중복체크
                first.three == second.three &&
                first.two == second.two &&
                first.one == second.one) {
            bw.write("0 " + first.totalScore());
        } else {
            bw.write(first+"");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static class Member {

        String number;
        int one;
        int two;
        int three;

        public Member(String number) {
            this.number = number;
        }

        public void vote(String s) {
            switch (s) {
                case "1":
                    one++;
                    break;
                case "2":
                    two++;
                    break;
                case "3":
                    three++;
            }
        }

        public int totalScore() {
            return one + two * 2 + three * 3;
        }

        @Override
        public String toString() {
            return number + " " + totalScore();
        }
    }
}
