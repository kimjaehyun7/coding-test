package baekjoon;

import java.io.*;

public class Baekjoon_9654 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("SHIP NAME      CLASS          DEPLOYMENT IN SERVICE\n" +
                "N2 Bomber      Heavy Fighter  Limited    21        \n" +
                "J-Type 327     Light Combat   Unlimited  1         \n" +
                "NX Cruiser     Medium Fighter Limited    18        \n" +
                "N1 Starfighter Medium Fighter Unlimited  25        \n" +
                "Royal Cruiser  Light Combat   Limited    4         ");
        bw.flush();
        bw.close();

    }
}
