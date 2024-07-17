package day01;

import java.util.Scanner;

public class OperatorEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //2자리 양수를 거꾸로 뒤집어 출력하기
        System.out.println("2자리 양수 입력");
        int input = Integer.parseInt(scanner.next());
        int output = (input % 10) * 10 + input / 10;
        System.out.println(output);

        //4자리 양수를 거꾸로 뒤집어 출력하기
        System.out.println("4자리 양수 입력");
        input = Integer.parseInt(scanner.next());
        output = 0;

        int temp = 1000;
        for (int i = 1; i <= 1000; i *= 10) {
            output += (input % (i*10) / i) * temp;
            temp /= 10;
        }
        System.out.println(output);


      /*
        아래는 화씨 를 섭씨 로 변환하는 코드이다 변환공식이 (Fahrenheit) (Celcius) . 'C =
        5/9 ×(F - 32)' , 라고 할 때 에 알맞은 코드를 넣으시오 단 변환 결과값은 소수점
        셋째자리에서 반올림해야한다
        */
        System.out.println("화씨 입력");
        double dInput = Double.parseDouble(scanner.next());
        double dOutput = (double) 5 / 9 * (dInput - 32);
        System.out.print(Math.round(dOutput*100)/100.0);


    }
}
