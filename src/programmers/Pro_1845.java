package programmers;

import java.util.HashSet;
import java.util.Set;

public class Pro_1845 {
    public int solution(int[] nums) {
        int answer = 0;
        int choice = nums.length / 2;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        if (choice > set.size()) {
            answer = set.size();
        } else {
            answer = choice;
        }

        return answer;
    }
}
