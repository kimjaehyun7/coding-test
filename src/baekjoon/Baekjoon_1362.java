package baekjoon;

import java.io.*;

public class Baekjoon_1362 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int scenario = 1;

        while (true) {
            String[] split = br.readLine().split(" ");
            int o = Integer.parseInt(split[0]);
            int w = Integer.parseInt(split[1]);
            if (o + w == 0) { // 종료
                break;
            }
            Pet pet = new Pet(w);

            while (true) {
                if (!action(br, pet)) {
                    if (!pet.status) { // 사망
                        bw.write(scenario + " RIP\n");
                    } else if (pet.weight > o / 2 && pet.weight < o * 2) { // 행복
                        bw.write(scenario + " :-)\n");
                    } else { // 슬픔
                        bw.write(scenario + " :-(\n");
                    }
                    break;
                }
            }
            scenario++;
        }

        bw.flush();
        bw.close();
        br.close();

    }

    private static boolean action(BufferedReader br, Pet pet) throws IOException {
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[1]);

        switch (split[0]) {
            case "F":
                pet.feed(n);
                break;
            case "E":
                pet.exercise(n);
                if (pet.weight <= 0) {
                    pet.dead();
                }
                break;
            case "#":
                return false;
        }
        return true;
    }

    private static class Pet {
        int weight;
        boolean status;

        public Pet(int weight) {
            this.weight = weight;
            status = true;
        }

        void exercise(int min) { // 운동
            if (status) {
                weight -= min;
            }
        }

        void feed(int num) { // 먹이
            if (status) {
                weight += num;
            }
        }

        void dead() { // 사망
            status = false;
        }

    }
}
