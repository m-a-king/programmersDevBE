package day01;

import java.util.Scanner;

/*윤년 판단 기준
- 년도를 4로 나누어떨어지면서 100으로는 나누어 떨어지면 안된다
- 다만 400으로 나누어 떨어지면 윤년
*
* */
public class DayOfYear {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] mdays = {
                {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
                {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
        };

        System.out.println("년도: ");
        int year = sc.nextInt();
        System.out.println("월: ");
        int month = sc.nextInt();
        System.out.println("일: ");
        int day = sc.nextInt();

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        for (int i = 1; i < month; i++) {
            day += mdays[isLeap ? 1 : 0][i - 1];
        }

        System.out.println(year +"년의 " +day+"일째 입니다.");
    }
}
