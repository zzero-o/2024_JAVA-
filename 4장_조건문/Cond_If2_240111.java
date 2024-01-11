package condition_4;

// 조건문
// if문과 else if문
// #1 예제
// #2 중괄호 생략 가능
public class Cond_If2_240111 {
    public static void main(String[] args) {
        // #1
        /*
        [예제 1] 온라인 쇼핑몰의 할인 시스템
                (할인조건)
                아이템 가격이 10000원 이상일 때, 1000원 할인
                나이가 10살 이하일 때 1000원 할인
         */
        int price = 10000; // 가격 변수 선언 및 초기화
        int age2 = 10; // 나이 변수 선언 및 초기화
        int discount = 0; // 할인 변수 선언 및 초기화

        // 10000원 이상 구매 시 할인 적용
        if (price >= 10000) {
            discount += 1000;
            System.out.println("10000원 이상 구매 - 1000원 할인");
        }
        // 어린이인 경우 할인 적용
        if (age2 <= 10) {
            discount += 1000;
            /*
            미성년자고 10000원 이상 구매 시
                (1) 10000원 이상 구매    => 기존 discount(0) 에서 1000 더함
                                         discount = 1000
                (2) 10살 (age2(10) <= 10)     => discount(1000)에서 1000 더함
                                         discount = 2000
             */
            System.out.println("어린이 - 1000원 할인");
        }

        System.out.println("할인 가격 : " + discount + "원");


        // [예제 1 - 오답] else if문을 사용한 경우
        discount = 0;
        if (price > 10000) {
            discount += 1000;
            System.out.println("10000원 이상 구매 - 1000원 할인");
        } else if (age2 <= 10) {
            /*
            else if문은 if문에서 false 값이 나와야 실행

            price가 10000원 이상으로 true이기 때문에 age 할인은 적용되지 않는다
             */
            discount += 1000;
            System.out.println("어린이 - 1000원 할인");
        }

        System.out.println("할인 가격 : " + discount + "원");


        // #2
        if (true) System.out.println("if문 실행"); // 한줄만 적용된다

        if (false)
            System.out.println("if문 실행");
            System.out.println("if문 실행 안됨");

        /*
            "if문 실행", "if문 실행 안됨" 모두 출력되지 않아야 하는데,
            "if문 실행 안됨"만 실행된다.
         */

        if (false) {
            System.out.println("if문 실행");
        }
        System.out.println("if문 실행 안됨"); // 이렇게 인식
    }
}
