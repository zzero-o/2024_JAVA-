package loop_5;

// 반복문
// break (반복문을 즉시 종료하고 빠져나간다)
public class Loop4_Break_240111 {
    public static void main(String[] args) {
        /*
        [예제 1] 1부터 시작해서 숫자를 계소 누적해서 더하다가,
                합계가 10보다 처음으로 큰 값은 얼마인가?
         */

        int sum = 0; // 합계 변수 선언 및 초기화
        int i = 1; // 더하는 값 변수 선언 및 초기화

        while (true) {
            sum += i;
            if (sum > 10) {
                System.out.println("i = " + i + ", 합계 = " + sum);
                // break를 먼저 하면, 이 값도 출력 안하고 빠져나감
                break;
            } else {
                i++;
            }
            /*
                while (true) : 무한 반복
                (1) sum = sum(0) + i(1)         -> sum = 1
                (2) 조건문의 식이 참인지 확인          -> sum(1) > 10 : false
                (3) else문 : i++                   -> i = i(1) + 1       i = 2

                (4) sum = sum(1) + i(2)         -> sum = 3
                (5) 조건문의 식이 참인지 확인          -> sum(3) > 10 : false
                (6) else문 : i++                   -> i = i(2) + 1       i = 3

                (7) sum = sum(3) + i(3)         -> sum = 6
                (8) 조건문의 식이 참인지 확인          -> sum(6) > 10 : false
                (9) else문 : i++                   -> i = i(3) + 1       i = 4

                (10) sum = sum(6) + i(4)        -> sum = 10
                (11) 조건문의 식이 참인지 확인         -> sum(10) > 10 : false
                (12) else문 : i++                  -> i = i(4) + 1       i = 5

                (13) sum = sum(10) + i(5)       -> sum = 15
                (14) 조건문의 식이 참인지 확인         -> sum(15) > 10 : true
                (15) if문 : 출력 후 break

                (16) 반복문 종료
             */
        }
    }
}
