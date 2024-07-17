package day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class ArrayTest3 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("사람 수를 입력하세요");
        int n = Integer.parseInt(bufferedReader.readLine());

        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = new Random().nextInt(91) + 100;
        }

        for(int i = 0; i < n; i++) {
            System.out.println("heights[" + i + "] = " + heights[i]);
        }

        System.out.println("제일 큰 키 " + maxOf(heights));
        System.out.println("제일 작은 키 " + minOf(heights));
    }

    private static int minOf(int[] heights) {

            int min = heights[0];
            for (int i = 1; i < heights.length; i++) {
                if (heights[i] < min) {
                    min = heights[i];
                }
            }

            return min;
    }

    private static int maxOf(int[] heights) {

        int max = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > max) {
                max = heights[i];
            }
        }

        return max;
    }
}
