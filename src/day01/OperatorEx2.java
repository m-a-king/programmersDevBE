package day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperatorEx2 {
    /*
    -------------------------------------------
    비만도 측정(BMI지수)
    BMI를 이용한 비만도 계산은 자신의 몸무게를 키의 제곱으로
    나누는 것으로 공식은 kg/㎡. BMI가 18.5 이하면 저체중 ／
    18.5 ~ 24.9 사이면 정상 ／ 25.0 ~ 29.9 사이면 과체중 ／
    30.0 이상부터는 비만으로 판정.
    신체질량지수
    (BMI) = 체중(kg)/[신장(m)]2
    -------------------------------------------
    주의: 키 입력: 키를 cm 단위로 입력받습니다.
    단위 변환: 입력받은 cm 단위의 키를 m 단위로 변환합니다 (heightCm / 100).
    BMI 계산: 변환된 키를 사용하여 BMI를 계산합니다.
    */

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("키 입력");
        int height = Integer.parseInt(bufferedReader.readLine());
        System.out.println("몸무게 입력");
        int weight = Integer.parseInt(bufferedReader.readLine());

        OperatorEx2 operatorEx2 = new OperatorEx2();
        double bmi = operatorEx2.calcBmi(weight, height);
        System.out.println("bmi = " + bmi);


        System.out.println(
                operatorEx2.getCategory(bmi));

    }

    private String getCategory(double bmi) {
        return
                bmi <= 18.5 ? "저체중" :
                        bmi < 25 ? "정상" :
                                bmi < 30 ? "과체중" : "비만";
    }

    private double calcBmi(double weight, int height) {
        return weight / (height * height) * 10000;
    }
}
