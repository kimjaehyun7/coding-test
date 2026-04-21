package programmers;

public class Pro_181943 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        int idx = 0;
        for (int i = 0; i < s; i++) {
            sb.append(my_string.charAt(i));
            idx++;
        }
        for (int i = 0; i < overwrite_string.length(); i++) {
            sb.append(overwrite_string.charAt(i));
            idx++;
        }
        for (int i = idx; i < my_string.length(); i++) {
            sb.append(my_string.charAt(i));
        }

        return answer = sb.toString();
    }
}
