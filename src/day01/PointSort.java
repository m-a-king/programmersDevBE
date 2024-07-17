package day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PointSort {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[][] points = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());

            points[i][0] = x;
            points[i][1] = y;
        }

        Arrays.sort(points, (p1, p2) -> {
            if (p1[0] == p2[0]) {
                return p2[1] - p1[1];
            }
            return p2[0] - p1[0];
        });

        for(int[] p: points) {
            System.out.println(p[0] + " " + p[1]);
        }
    }
}
