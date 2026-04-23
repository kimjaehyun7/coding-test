package programmers;

public class Pro_181932 {
    public String solution(String code) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            if (mode == 0) {
                char c = code.charAt(i);
                if (c == '1') {
                    mode = 1;
                } else {
                    if (i % 2 == 0) {
                        sb.append(c);
                    }
                }
            } else if (mode == 1) {
                char c = code.charAt(i);
                if (c == '1') {
                    mode = 0;
                } else {
                    if (i % 2 == 1) {
                        sb.append(c);
                    }
                }
            }
        }
        if (sb.length() == 0) {
            sb.append("EMPTY");
        }
        return answer = sb.toString();
    }
}
