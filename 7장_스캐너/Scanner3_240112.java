package scanner_7;

import java.util.Scanner;

public class Scanner3_240112 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //[예제 1] 사용자가 입력한 문자열을 그대로 출력하는 프로그램
        //       (exist라는 문자가 입력되면 프로그램 종료)
        while (true) {
            // (1) 문자열 입력 받기
            System.out.print("문자열을 입력하세요(exist는 종료) : ");
            String str = scanner.nextLine();

            // (2) exist를 입력한 경우
            if (str.equals("exist")) {
                System.out.println("프로그램을 종료합니다");
                break;
            }

            // (3) exist를 입력하지 않은 경우
            System.out.println("입력하신 문자열은 " + str + "입니다.");
        }


        // [예제 2] 첫번째 숫자와 두번째 숫자를 더해서 출력하는 프로그램
        //         (첫번째 숫자와 두번째 숫자 모두 0을 입력하면 종료)
        while (true) {
            // (1) 첫 번째 정수 입력 받기
            System.out.print("첫 번째 정수를 입력하세요 (0 입력시 종료) : ");
            int num1 = scanner.nextInt();

            // (2) 두 번째 정수 입력 받기
            System.out.print("두 번째 정수를 입력하세요 (0 입력시 종료) : ");
            int num2 = scanner.nextInt();

            // (3) 두 수의 합 구하기
            int sum = num1 + num2;

            // (4) 종료하는 경우 (두 숫자 모두 0을 입력하였을 때)
            if (num1 == 0 && num2 == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // (5) 계속 실행하는 경우
            System.out.println("두 수의 합은 " + sum + "입니다.");
        }


        // [예제 3] 사용자 입력을 받아 그 합계를 계산하는 프로그램
        //         (사용자가 0을 입력하면 프로그램 종료)
        //          종료 시, 사용자가 입력한 모든 정수의 값 출력
        int sum = 0;

        while (true) {
            // (1) 정수 입력 받기
            System.out.print("정수를 입력하세요 (0 입력시 종료) : ");
            int num = scanner.nextInt();

            // (2) 입력한 값들 합 구하기
            sum += num;

            // (2) 종료되는 경우
            if (num == 0) {
                System.out.println("현재까지 입력하신 값들의 합은 " + sum + "입니다.");
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
