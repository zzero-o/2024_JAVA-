package scanner_7;

import java.util.Scanner;

// 문제 풀이
public class Scanner5_Q_240112 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        [문제 1] 변수 값 교환
            변수 a = 10, b = 20
            temp 변수 사용
         */
        while (true) {
            // (1) 첫 번째 변수 값 입력 받기
            System.out.print("a에 들어갈 정수를 입력하세요. (값이 같은 경우 종료) : ");
            int a = scanner.nextInt();

            // (2) 두 번째 변수 값 입력 받기
            System.out.print("b에 들어갈 정수를 입력하세요. (값이 같은 경우 종료) : ");
            int b = scanner.nextInt();

            // (3) 값을 서로 교환하기
            int temp;

            temp = a; // temp는 a의 값을 갖게 됨   temp = a
            a = b;    // a는 b의 값을 갖게 됨 (a는 더이상 a로써의 기능을 못한다)
            b = temp; // b는 temp(a)의 값을 갖게 됨

            // (4) 종료하는 경우
            if (a == b) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // (5) 출력하는 경우
            System.out.println("a = " + a);
            System.out.println("b = " + b);

        }


        /*
        [문제 2] 사이 숫자
            사용자로부터 두 개의 정수를 입력받고 이 정수 사이의 모든 정수 출력
            - num1 : 첫번째 숫자 num2 : 두번째 숫자
            - num1이 num2보다 크면 교환
            - num1부터 num2까지의 각 숫자 출력
         */
        while(true) {
            // (1) 첫 번째 정수 입력 받기
            System.out.print("첫 번째 숫자를 입력하세요 (0 입력시 종료) : ");
            int num1 = scanner.nextInt();

            // (2) 두 번째 정수 입력 받기
            System.out.print("두 번째 숫자를 입력하세요 (0 입력시 종료) :");
            int num2 = scanner.nextInt();

            // (3) 첫 번째 정수가 두 번째 정수보다 큰 경우 교환
            if (num1 > num2) {
                int num3 = num1;    // num3는 num1의 값을 가짐
                num1 = num2;        // num1은 num2의 값을 가짐 (더이상 num1의 역할을 하지 못한다)
                num2 = num3;         // num2는 num3(num1)의 값을 가짐
            } else if (num1 == 0 & num2 == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // (4) num1부터 num2까지의 각 숫자 출력
            System.out.println("두 숫자 사이의 모든 정수 : ");
            while (num1 <= num2) {
                System.out.print(num1);
                if (num1 != num2) {
                    System.out.print(", ");
                }
                num1++;
            }
            System.out.println();

        }
    }
}
