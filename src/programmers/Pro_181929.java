package programmers;

public class Pro_181929 {
    public int solution(int[] num_list) {
        int answer = 0;

        int mul = 1;
        int sum = 0;
        for (int i : num_list) {
            mul *= i;
            sum += i;
        }

        int pow = sum * sum;

        if (mul < pow) {
            answer = 1;
        }


        return answer;
    }
}
