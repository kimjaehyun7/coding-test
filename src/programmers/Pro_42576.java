package programmers;

import java.util.HashMap;
import java.util.Map;

public class Pro_42576 {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String s : completion) {
            map.put(s, map.getOrDefault(s, 0) - 1);
        }

        String answer = "";
        for (String s : map.keySet()) {
            if (map.get(s) == 1) {
                answer = s;
            }
        }
        return answer;
    }
}
