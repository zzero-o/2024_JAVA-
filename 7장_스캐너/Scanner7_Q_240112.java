package scanner_7;

import java.util.Scanner;

public class Scanner7_Q_240112 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        [문제 1] 입력한 숫자의 합계와 평균
            사용자로부터 여러개의 숫자를 입력받고 그 숫자의 합계와 평균 계산
            (평균은 소수점 아래까지 계산)
         */
        int sum = 0;
        int count = 0;
        double avg = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요 : ");

        while (true) {
            // (1) 숫자 입력 받기
            int num = scanner.nextInt();

            // (2) 입력 중단 및 출력하기
            if (num == -1) {
                System.out.println("입력한 숫자들의 합계 : " + sum);
                System.out.println("입력한 숫자들의 평균 : " + avg);
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // (3) 합계 구하기
            sum += num;

            // (4) 평균 구하기
            count++;
            avg = (double) sum / count;
        }


        /*
        [문제 2] 상품 구매
            사용자로부터 상품 정보 (상품명, 가격, 수량)를 입력 받고, 이들의 총 가격을 출력하는 프로그램
            1. 상품 입력, 2. 결제, 3. 프로그램 종료의 옵션 제공
         */
        sum = 0;

        while(true) {
            // (1) 선택한 옵션 입력 받기
            System.out.println("1 : 상품 입력, 2 : 결제, 3 : 프로그램 종료");
            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                // 1. 상품명 입력 받기
                System.out.print("상품명을 입력하세요 : ");
                String name = scanner.nextLine();

                // 2. 상품 가격 입력 받기
                System.out.print("상품의 가격을 입력하세요 : ");
                int price = scanner.nextInt();
                scanner.nextLine();

                // 3. 상품 수량 입력 받기
                System.out.print("구매 수량을 입력하세요 : ");
                int quantity = scanner.nextInt();
                scanner.nextLine();

                // 4. 출력하기
                int totalPrice = price * quantity;
                sum += totalPrice;
                System.out.println("상품명 : " + name + ", 가격 : " + price + ", 수량 : " + quantity + ", 합계 : " + totalPrice);
                continue;
            } else if (option == 2) {
                // 1. 출력하기
                System.out.println("총 비용 : " + sum);

                // 2. 다음 사람을 위해 초기화하기
                sum = 0;
                continue;
            } else if (option == 3) {
                // 1. 종료 문구 출력하기
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("없는 옵션입니다.");
                continue;
            }
        }
    }
}
