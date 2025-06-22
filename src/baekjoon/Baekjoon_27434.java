package baekjoon;

import java.io.*;
import java.math.BigInteger;

public class Baekjoon_27434 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger one = BigInteger.valueOf(1);
        int n = Integer.parseInt(br.readLine());

        BigInteger result = factorial(one, BigInteger.valueOf(n));

        bw.write(result.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    private static BigInteger factorial(BigInteger first, BigInteger end) {
        // 0! -> 1 이기 때문에 이 로직이 없으면 무한 재귀호출 발생 -> 스택오버플로우
        if (end.equals(BigInteger.ZERO)) return BigInteger.ONE;
        // 검증, 값 반환
        if (first.equals(end)) return first;
        if (first.add(BigInteger.ONE).equals(end)) return first.multiply(end);

        // 트리 구조로 쪼개기
        BigInteger mid = first.add(end).divide(BigInteger.TWO);

        // 재귀 호출
        return factorial(first, mid).multiply(factorial(mid.add(BigInteger.ONE), end));
    }
}
