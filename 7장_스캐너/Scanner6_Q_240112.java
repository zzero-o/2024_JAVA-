package scanner_7;

import java.util.Scanner;

public class Scanner6_Q_240112 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        [문제 1] 이름과 나이 반복
            사용자가 종료를 입력하면 종료
         */
        while (true) {
            // (1) 사용자로부터 이름 입력 받기
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료) : ");
            String name = scanner.nextLine();

            // (2) 종료하는 경우
            if (name.equals("종료")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // (3) 사용자로부터 나이 입력 받기
            System.out.print("나이를 입력하세요 : ");
            int age = scanner.nextInt();
            scanner.nextLine(); //숫자 입력 후의 줄바꿈 처리

            // (4) 출력하기
            System.out.println("입력한 이름 : " + name + ", 나이 : " + age);
        }


        /*
        [문제 2] 상품 가격 계산
            사용자로부터 상품의 가격 (price)와 수량 (quantity)를 입력 받고 총 비용 출력
            총비용 = 가격 * 수량
         */
        while (true) {
            // (1) 상품 가격 입력 받기
            System.out.print("상품의 가격을 입력하세요 (-1을 입력하면 종료) : ");
            int price = scanner.nextInt();

            // (2) 종료하는 경우
            if (price == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // (3) 상품 수량 입력 받기
            System.out.print("구매하려는 수량을 입력하세요 : ");
            int quantity = scanner.nextInt();

            // (4) 총비용 출력
            int totalPrice = price * quantity;
            System.out.println("총 비용 : " + totalPrice);
        }


    }
}
