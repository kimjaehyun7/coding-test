package programmers;

public class Pro_43165 {
    public int solution(int[] numbers, int target) {
        int answer = 0;

        answer = dfs(numbers, 0, target, 0);

        return answer;
    }

    static int dfs(int[] numbers, int count, int target, int sum) {
        if (count == numbers.length) {
            if (target == sum) {
                return 1;
            } else {
                return 0;
            }
        }
        int plus = sum + numbers[count];
        int minus = sum - numbers[count];

        return dfs(numbers, count + 1, target, plus)
                + dfs(numbers, count + 1, target, minus);
    }
}
