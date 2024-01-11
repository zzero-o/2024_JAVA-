package scanner_7;

import java.util.Scanner;

// 문제 풀이
public class Scanner4_Q_240112 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        [문제 1] 이름 나이 입력받고 출력하기
            사용자로부터 입력받은 이름과 나이를 출력하세요
            (출력형태는 "당신의 이름은 [이름]이고, 나이는 [나이]살입니다.")
         */
        // (1) 사용자로부터 이름(문자열) 입력 받기
        System.out.print("당신의 이름을 입력하세요. : ");
        String name = scanner.nextLine();

        // (2) 사용자로부터 나이(정수) 입력 받기
        System.out.print("당신의 나이를 입력하세요. : ");
        int age = scanner.nextInt();

        // (3) 종료하지 않는 경우 (이름, 나이 출력)
        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "살입니다.");


        /*
        [문제 2] 홀수 짝수
            사용자로부터 하나의 정수를 입력받고, 홀수인지 짝수인지 판별
         */
        while (true) {
            // (1) 사용자로부터 정수 입력 받기
            System.out.print("정수를 입력하세요. (0 입력시 종료) : ");
            int num = scanner.nextInt();

            String str;

            // (2) 종료 및 홀수 짝수 판별
            if (num == 0) {
                // 0인 경우 종료
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (num % 2 == 0) {
                // 2로 나눴을 때 나머지가 0인 경우
                str = "짝수";
            } else {
                str = "홀수";
            }

            // 출력
            System.out.println("입력한 숫자 " + num + "는 " + str + "입니다.");
        }


        /*
        [문제 3] 음식점 주문
            사용자로부터 음식의 이름(foodName), 가격(foodPrice), 수량(foodQuantity) 입력 받기
            그 후, 한 음식의 총 가격을 계산하고 출력하는 프로그램
            (총 가격(totalPrice) = 각 음식의 가격 * 수량)
            출력형태 : [음식 이름] [수량]개를 주문하셨습니다. 총가격은 [총 가격]원입니다."
         */
        // (1) 음식의 이름 입력 받기
        System.out.print("음식의 이름을 입력해주세요. : ");
        String foodName = scanner.nextLine();

        // (2) 음식의 가격 입력 받기
        System.out.print("음식의 가격을 입력해주세요. : ");
        int foodPrice = scanner.nextInt();

        // (3) 음식의 수량 입력 받기
        System.out.print("음식의 수량을 입력해주세요 : ");
        int foodQuantity = scanner.nextInt();

        // (4) 총 가격 구하기
        int totalPrice = foodPrice * foodQuantity;

        // (5) 출력하기
        System.out.println(foodName + foodQuantity + "개를 주문하셨습니다. 총 가격은 " + totalPrice + "원입니다.");


        /*
        [문제 4] 구구단 출력
            사용자로 부터 하나의 정수를 입력받고, 입력받은 정수의 구구단 출력
         */
        while (true) {
            // (1) 단 수 입력 받기
            System.out.print("구구단의 단 수를 입력해주세요 (0 입력시 종료) : ");
            int n = scanner.nextInt();

            // (2)
            if (n == 0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // (3) 구구단 출력
            System.out.println(n + "단의 구구단 : ");
            for (int i = 1; i <= 9; i++) {
                System.out.println(n + " x " + i + " = " + n * i);
            }
        }
    }
}
