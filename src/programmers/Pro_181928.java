package programmers;

public class Pro_181928 {
    public int solution(int[] num_list) {
        int answer = 0;

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i : num_list) {
            if (i % 2 == 1) {
                sb1.append(i);
            } else {
                sb2.append(i);
            }
        }

        int odd = Integer.parseInt(sb1.toString());
        int even = Integer.parseInt(sb2.toString());

        int sum = odd + even;
        return answer = sum;
    }
}
