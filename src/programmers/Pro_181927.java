package programmers;

public class Pro_181927 {
    public int[] solution(int[] num_list) {
        int[] answer;

        int l = num_list.length;
        answer = new int[l + 1];
        for (int i = 0; i < l; i++) {
            answer[i] = num_list[i];
        }

        if (num_list[l - 1] > num_list[l - 2]) {
            int i = num_list[l - 1] - num_list[l - 2];
            answer[l] = i;
        } else {
            int i = num_list[l - 1] * 2;
            answer[l] = i;
        }
        return answer;
    }
}
