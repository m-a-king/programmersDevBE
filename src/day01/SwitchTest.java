package day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class SwitchTest {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String day = bufferedReader.readLine();

        int daynum = switch (day) {
            case "일" -> 1;
            case "월" -> 2;
            case "화" -> 3;
            case "수" -> 4;
            case "목" -> 5;
            case "금" -> 6;
            case "토" -> {
                System.out.println("즐토");
                yield 7;
            }
            default -> -1;
        };

        System.out.println(daynum);
        Calendar calendar = Calendar.getInstance();
        int today = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(today);

        // 오늘로부터 입력한 가장 가까운 요일까지 며칠 남았는지
        int diff = daynum - today > -1 ? daynum - today : 7 + daynum - today;
        System.out.println(diff);

        int currYear = 2024;
        int currMonth = 7;
        int currDay = 16;

        System.out.println(currYear + "년 " + currMonth + "월 " + (currDay + diff) + "일");
    }
}
