package baekjoon;

import java.io.*;

public class Baekjoon_1296 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int maxWinRate = 0;
        String maxWinRateTeam = null;

        String green = br.readLine();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String team = br.readLine();
            int winRate = getWinRate(green, team);
            if (winRate > maxWinRate) {
                maxWinRate = winRate;
                maxWinRateTeam = team;
            } else if (winRate == maxWinRate && maxWinRate != 0) {
                if (maxWinRateTeam.compareTo(team) > 0) { // 사전 순으로 앞섬
                    maxWinRateTeam = team;
                }
            } else if (winRate == 0 && maxWinRate == 0) {
                if (maxWinRateTeam == null) {
                    maxWinRateTeam = team;
                } else {
                    if (maxWinRateTeam.compareTo(team) > 0) { // 사전 순으로 앞섬
                        maxWinRateTeam = team;
                    }
                }
            }
        }

        bw.write(maxWinRateTeam);
        bw.flush();
        bw.close();
        br.close();
    }

    private static int getWinRate(String green, String team) {
        int l = 0;
        int o = 0;
        int v = 0;
        int e = 0;

        for (char c : (green + team).toCharArray()) {
            switch (c) {
                case 'L':
                    l++;
                    break;
                case 'O':
                    o++;
                    break;
                case 'V':
                    v++;
                    break;
                case 'E':
                    e++;
            }
        }
        int winRate = ((l + o) * (l + v) * (l + e) * (o + v) * (o + e) * (v + e)) % 100;
        return winRate;
    }
}
