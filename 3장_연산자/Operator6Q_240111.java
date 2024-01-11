package operator_3;

// 문제풀이
public class Operator6Q_240111 {
    public static void main(String[] args) {
        /*
        [문제 1] num1, num2, num3라는 이름의 세 개의 int 변수를 선언하고 각각 10,20,30으로 초기화
                세 변수의 합을 계산하고, 그 결과를 sum이라는 이름의 int 변수에 저장
                세 변수의 평균을 계산하고, 그 결과를 averge라는 이름의 int 변수에 저장
                (평균 계산 시 소수점 이하의 결과는 버림)
                sum과 average 변수의 값을 출력
         */

        //변수 선언 및 변수 초기화
        int num1 = 10, num2 = 20, num3 = 30;
        int sum = num1 + num2 + num3; // 세 변수의 합
        int average = sum / 3; // 세 변수의 평균

        System.out.println("합계 = " + sum + ", " + "평균 = " + average);


        /*
        [문제 2] double 변수들을 선언하고 그 합과 평균을 출력하는 프로그램을 작성하세요
         */
        double val1 = 1.5, val2 = 2.5, val3 = 3.5; // 실수 변수 선언 및 초기화
        double sum1 = val1 + val2 + val3; // 세 변수의 합
        double avg = sum1 / 3; // 세 변수 평균

        System.out.println("합계 = " + sum1 + ", " + "평균 = " + avg);


        /*
        [문제 3] int형 변수 score를 선언하세요
                score가 80점 이상이고 100점 이하면 true를 출력하고,
                아니면 false를 출력하세요
         */
        int score1 = 95;
        int score2 = 75;

        System.out.println(score1 >= 80 && score1 <= 100);
        System.out.println(score2 >= 80 && score2 <= 100);
    }
}
