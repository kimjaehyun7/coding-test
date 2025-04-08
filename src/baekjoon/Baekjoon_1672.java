package baekjoon;

import java.io.*;

public class Baekjoon_1672 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();

        // while 문 -> StringBuilder 에 입력한 문자열 넣은 후 길이가 1이 될때까지 맨 뒤 두개를 지우고 하나 추가하고를 반복
        // 그러면 while 문이 한번 돌때 sb 변수는 사라지지만 new StringBuilder 객체는 heap 에 남아있게 됨. -> 메모리 초과
        // 대신 char 배열은 한 번 생성 후 삭제나 추가 없이 두 값을 계산 해서 덮어쓰는 방식이기 때문에 메모리 차지 x

        for (int i = n - 1; i > 0; i--) {
            arr[i - 1] = getValue(arr[i - 1], arr[i]);
        }

        bw.write(arr[0]+"");
        bw.flush();
        bw.close();
        br.close();

    }

    private static char getValue(char a, char b) {
        if (a == b) {
            return a;
        }
        int result = (a + b) - 130;

        switch (result) {
            case 2:
            case 25:
                return 'A';
            case 19:
            case 21:
                return 'G';
            case 6:
                return 'C';
            case 8:
                return 'T';
            default:
                return 0;
        }
    }
}
