package scanner_7;

import java.util.Scanner;

// 기본 스캐너
public class Scanner2_240112 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // [예제 1] 두 수를 입력받고 그 합을 출력
        // (1) 첫 번째 정수 입력 받기
        System.out.print("정수를 입력하세요 : ");
        int intValue1 = scanner.nextInt();

        // (2) 두 번째 정수 입력 받기
        System.out.print("정수를 입력하세요 : ");
        int intValue2 = scanner.nextInt();

        // (3) 두 수의 합 구하기
        int sum = intValue1 + intValue2;

        // (4) 출력
        System.out.println("입력하신 값들의 합은 " + sum + "입니다.");


        // [예제 2] 두 수를 입력받고 더 큰 수를 출력
        //        (두 수가 같은 경우, 두 수는 같다고 출력)
        // (1) 첫 번째 정수 입력 받기
        System.out.print("첫 번째 정수를 입력하세요 : ");
        intValue1 = scanner.nextInt();

        // (2) 두 번째 정수 입력 받기
        System.out.print("두 번째 정수를 입력하세요 : ");
        intValue2 = scanner.nextInt();

        // (3) 두 수 비교하기
        int result = 0;
        if (intValue1 > intValue2) {
            result = intValue1;
        } else if (intValue1 < intValue2) {
            result = intValue2;
        } else {
            System.out.println("입력하신 두 정수는 같습니다.");
        }

        // (4) 출력하기
        System.out.println("더 큰 정수는 " + result + "입니다.");
    }
}
