package array_8;

import java.util.Scanner;

// 문제 풀이
public class Array4_Q_240112 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
            [문제 1] 배열을 사용하도록 변경
            int student1 = 90;
            int student2 = 80;
            int student3 = 70;
            int student4 = 60;
            int student5 = 50;

            int total = student1 + student2 + student3 + student4 + student5;
            double average = (double) total / 5;

            System.out.println("점수 총합 : " + total);
            System.out.println("점수 평균 : " + average);
         */
        // #1 일반 for문
        // (1) 변수 점수 배열 선언 및 초기화
        int[] score1 = {90, 80, 70, 60, 50};
        int total = 0;
        double average = 0;

        // (2) 배열 자동 사용
        for (int i = 0; i < score1.length; i++) {
            // 1. 배열의 값의 합 구하기 (점수 총합)
            total += score1[i];

            // 2. 배열의 값의 평균 구하기 (점수 평균)
            average = (double) total / score1.length;
        }

        // (3) 출력하기
        System.out.println("점수 총합 : " + total);
        System.out.println("점수 총합 : " + average);

        // #2 for each문
        // (1) 변수 점수 배열 선언 및 초기화
        int[] score2 = {90, 80, 70, 60, 50};
        total = 0;
        average = 0;

        // (2) 배열 자동 사용
        for (int i : score2) {
            // 1. 배열의 값의 합 구하기 (점수 총합)
            total += i;

            // 2. 배열의 값의 평균 구하기 (점수 평균)
            average = total / score2.length;
        }

        // (3) 출력하기;
        System.out.println("점수 총합 : " + total);
        System.out.println("점수 총합 : " + average);


        /*
        [문제 2] 배열의 입력과 출력
            사용자에게 5개의 정수를 입력받아서 배열에 저장 후, 입력 순서대로 출력
            출력시, 출력 포멧은 1, 2, 3, 4, 5와 같이, 쉼표를 사용해서 구분하고, 마지막에는 쉼표를 넣지 않아야한다
         */
        // #1 일반 for문
        // (1) 변수 배열 선언
        int [] numbers = new int[5];

        // (2) 사용자로부터 5개의 정수 입력 받기
        System.out.println("5개의 정수를 입력하세요 : ");

        // (3) 입력 받은 값 배열에 넣기 (배열 초기화)
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // (4) 출력하기
        System.out.println("출력 : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();


        /*
        [문제 3] 배열과 역순 출력
            사용자에게 5개의 정수를 입력 받아서 배열에 저장
            입력받은 순서의 반대인 역순으로 출력
         */
        // #1 일반 for문
        // (1) 변수 배열 선언
        int[] num3 = new int[5];

        // (2) 사용자로부터 5개의 정수를 입력 받기
        System.out.println("5개의 정수를 입력하세요 : ");

        // (3) 받은 정수는 변수 배열에 담기
        for (int i = 0; i < num3.length; i++) {
            num3[i] = scanner.nextInt();
        }

        // (4) 역순으로 출력하기
        System.out.println("입력한 정수를 역순으로 출력 : ");
        for (int i = (num3.length - 1); i >= 0; i--) {
            System.out.print(num3[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();


        /*
        [문제 4] 합계와 평균
            사용자에게 5개의 정수를 입력받아서 이들 정수의 합계와 평균을 계산하는 프로그램
         */
        // #1 일반 for문
        int sum = 0;

        // (1) 사용자로부터 5개의 정수 입력 받기
        System.out.println("5개의 정수를 입력하세요 : ");

        // (2) 사용자로부터 입력 받는 5개의 변수 차례로 변수 배열에 넣기
        int[] num4 = new int[5]; //num4를 5개로 나눈다
        for (int i = 0; i < num4.length; i++) {
            num4[i] = scanner.nextInt();

            // (3) 입력한 수의 합
            sum += num4[i];
        }

        // (4) 입력한 수의 평균
        double avg = (double) sum / num4.length;

        // (5) 출력하기
        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입력한 정수의 평균 : " + avg);


        /*
        [문제 5] 합계와 평균 2
            이전 문제에서 입력받을 숫자의 개수를 입력받음
         */
        // #1 일반 for문
        while (true) {
            sum = 0;

            // (1) 입력 받을 숫자의 개수 입력 받기
            System.out.print("입력받을 숫자의 개수를 입력하세요 (0입력시 종료): ");
            int intNum = scanner.nextInt();

            // (2) 종료하는 조건
            if (intNum == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // (3) n개의 정수 입력 받기
            System.out.println(intNum + "개의 정수를 입력하세요 : ");

            int[] num5 = new int[intNum];
            // (4) 입력 받은 정수를 배열 변수에 초기화
            for (int i = 0; i < num5.length; i++) {
                num5[i] = scanner.nextInt();

                // (5) 입력한 정수의 합계
                sum += num5[i];
            }

            // (6) 입력한 정수의 평균
            double average1 = sum / num5.length;

            // (7) 출력하기
            System.out.println("입력한 정수의 합계 : " + sum);
            System.out.println("입력한 정수의 평균 : " + average1);
        }
    }
}
