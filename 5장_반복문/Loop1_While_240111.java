package loop_5;

// 반복문
// while문
public class Loop1_While_240111 {
    public static void main(String[] args) {
        //[예제] 1을 한 번씩 더하는 반복문
        int count = 0; // 변수 선언 및 초기화

        while (count < 3) {
            count++; // count += 1과 같다
            System.out.println("현재 숫자는 : " + count);
            /*
                조건이 flase가 될 때까지 무한 루프
                (1) 변수 count(0)은 count(0) < 3에서 true
                (2) count++ : count = count(0) + 1      count = 1
                (3) 변수 count(1)은 count(1) < 3에서 true
                (4) count++ : count = count(1) + 1      count = 2
                (5) 변수 count(2)은 count(2) < 3에서 true
                (6) count++ : count = count(2) + 1      count = 3
                (7) 변수 count(3)은 count(3) < 3에서 false
                (8) 반복 종료
             */
        }


        // [예제 2] 1부터 하나씩 증가하는 수를 세 번 더하기
        int sum = 0;
        int i = 1;

        while (i <= 3) {
            sum += i;
            System.out.println("더해지는 수 : " + i + ", 합계 : " + sum);
            i++;
            /*
                (1) 조건이 참인지 확인 (i(1) <= 3 은 true)
                (2) sum = sum(0) + i(1)     => sum = 1
                (3) i++ : i = i(1) + 1      => i = 2

                (4) 조건이 참인지 확인 (i(2) <= 3 은 true)
                (5) sum = sum(1) + i(2)     => sum = 3
                (6) i++ : i = i(2) + 1      => i = 3

                (7) 조건이 참인지 확인 (i(3) <= 3 은 true)
                (8) sum = sum(3) + i(3)     => sum = 6
                (9) i++ : i = i(3) + 1      => i = 4

                (10) 조건이 참인지 확인 (i(4) <= 3 은 false)
                (11) 반복 종료
             */
        }


        // [예제 3] i부터 하나씩 증가하는 수를 endNum(마지막 수)까지 더해라
        int sum1 = 0;
        int i1 = 1;
        int endNum = 10;

        while (i1 <= endNum) {
            sum1 += i1;
            System.out.println("더해지는 수 : " + i1 + ", 합계 : " + sum1);
            i1++;
        }
    }
}
