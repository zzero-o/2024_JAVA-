package array_8;

import java.util.Scanner;

// 문제 풀이
public class Array5_Q_240112 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        [문제 1] 가장 작은 수, 큰 수 찾기
            사용자로부터 n개의 정수를 입력받아 배열에 저장한 후
            배열 내에서 가장 작은 수와 큰수를 찾아 출력 프로그램 작성
         */
        while (true) {
            // (1) 입력받을 숫자의 수를 입력 받기
            System.out.println("입력받을 숫자의 개수를 입력하세요 (0 입력시 종료) : ");
            int intNum = scanner.nextInt();

            // (2) 종료하는 경우
            if (intNum == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            int[] num = new int[intNum];
            int minNumber, maxNumber;

            // (3) n개의 숫자 입력 받기
            System.out.println(intNum + "개의 정수를 입력하세요 : ");

            // (4) n개의 숫자를 차례로 배열 변수에 초기화 시키기
            for (int i = 0; i < intNum; i++) {
                num[i] = scanner.nextInt();
            }

            minNumber = maxNumber = num[0];
            // (5) 가장 작은 정수와 큰 정수 찾기
            for (int i = 1; i < intNum; i++) {
                // 1. 가장 작은 정수 찾기
                if (num[i] < minNumber) {
                    minNumber = num[i];
                }

                // 2. 가장 큰 정수 찾기
                if (num[i] > maxNumber) {
                    maxNumber = num[i];
                }
            }

            // (6) 출력하기
            System.out.println("가장 작은 정수 : " + minNumber);
            System.out.println("가장 큰 정수 : " + maxNumber);
        }


        /*
        [문제 2] 2차원 배열 1
            사용자로부터 4명 학생의 국어, 수학, 영어 점수를 입력받아,
            각 학생의 총점과 평균 계산
         */
        // (1) 배열 변수 선언
        int[][] array1 = new int[4][3]; // 학생이 행, 과목이 열
        String[] subject = {"국어", "영어", "수학"};

        for (int row = 0; row < 4; row++) {
            System.out.println((row+1) + "번 학생의 성적을 입력하세요 : ");
            for (int col = 0; col < 3; col++) {
                // 학생 점수 출력
                System.out.println(subject[col] + "점수 : ");
                array1[row][col] = scanner.nextInt();
            }
        }

        // 출력하기
        for(int i = 0; i < 4; i++){
            int sum = 0;
            for(int j = 0; j < 3; j++){
                sum += array1[i][j];
            }
            double avg = sum / 3.0;
            System.out.println((i+1) + "번 학생의 총점: " + sum + ", 평균: " +
                    avg);
        }
    }
}
