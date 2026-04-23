package programmers;

public class Pro_181926 {
    public int solution(int n, String control) {
        int answer = n;

        for (char c : control.toCharArray()) {
            switch (c) {
                case 'w':
                    answer++;
                    break;
                case 's':
                    answer--;
                    break;
                case 'd':
                    answer += 10;
                    break;
                case 'a':
                    answer -= 10;
                    break;
            }
        }
        return answer;
    }
}
