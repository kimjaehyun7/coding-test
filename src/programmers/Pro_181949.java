package programmers;

import java.util.Scanner;

public class Pro_181949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (char c : a.toCharArray()) {
            if (c >= 97 && c <= 122) {
                System.out.print((char) (c - 32));
            } else {
                System.out.print((char) (c + 32));
            }
        }
    }
}
