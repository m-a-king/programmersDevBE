package day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conversion {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("양의 정수를 입력하세요");
        int n = Integer.parseInt(bufferedReader.readLine());
        System.out.println("몇 진수로 변경할까요");
        int rad = Integer.parseInt(bufferedReader.readLine());

        String str = "0123456789ABCDEF";
        String res = "";
        while (n > 0) {
            res = str.charAt(n % rad) + res;
            n /= rad;
        }

        System.out.println(res);
    }
}

// 5 -> 101