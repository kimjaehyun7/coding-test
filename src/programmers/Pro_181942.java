package programmers;

public class Pro_181942 {
    public String solution(String str1, String str2) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            sb.append(str1.charAt(i)).append(str2.charAt(i));
        }

        return answer = sb.toString();
    }
}
