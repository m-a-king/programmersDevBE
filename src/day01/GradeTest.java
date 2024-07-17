package day01;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GradeTest {
    /*
    학생 점수 데이터:
    Map<String, Integer>를 사용하여 학생의 이름과 점수를 저장합니다.
    학점 계산:

    calculateGrade 메서드는 점수를 받아 학점을 계산합니다.
    if-else 문을 사용하여 점수 범위에 따라 학점을 반환합니다.
    보너스 점수 적용:

    점수가 높은 학생일수록 더 많은 보너스를 받습니다.
    예를 들어, 90점 이상인 경우 10점, 80점 이상인 경우 5점, 70점 이상인 경우 2점을 보너스로 받습니다.
    보너스 점수가 적용된 경우 학점에 추가 설명을 붙입니다.
    출력:

    각 학생의 이름, 원래 점수, 보너스 점수 및 학점을 출력합니다.
    */

    public static void main(String[] args) throws IOException {

        Map<String, Integer> scores = new HashMap<>();
        scores.put("미영", 98);
        scores.put("철이", 85);
        scores.put("준이", 75);
        scores.put("하니", 65);
        scores.put("영희", 49);

        System.out.println(scores);

        System.out.println(calcGrade(scores));

    }

    public static String calcGrade(Map<String, Integer> scores) {
        System.out.println("학점 산출 중");
        StringBuilder s1 = new StringBuilder();

        for (Map.Entry<String, Integer> score : scores.entrySet()) {
            StringBuilder s2 = new StringBuilder();
            s2
                    .append(score.getKey())
                    .append(" score: ")
                    .append(score.getValue())
                    .append(" 학점(Grade): ")
                    .append(
                            score.getValue() >= 90 ? "A >>> 10 포인트 보너스" :
                                    score.getValue() >= 80 ? "B >>>  5 포인트 보너스" :
                                            score.getValue() >= 70 ? "C >>>  2 포인트 보너스" : "D");

            System.out.println(s2);

            s1.append(score.getKey())
                    .append(" = ")
                    .append(
                            score.getValue() >= 90 ? score.getValue() + 10 :
                                    score.getValue() >= 80 ? score.getValue() + 5 :
                                            score.getValue() >= 70 ? score.getValue() + 2 : score.getValue())
                    .append("\n");
        }

        return s1.toString();
    }
}
