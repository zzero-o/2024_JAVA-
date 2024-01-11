package loop_5;

// 문제 풀이
public class Loop8_Q_240111 {
    public static void main(String[] args) {
        /*
        [문제 1] 자연수 출력
            count 변수를 사용하여 처음 10개의 자연수 출력
         */
        // #1 while문
        int count = 1;

        while (count <= 10) {
            System.out.println(count);
            count++;
        }

        // #2 for문
        for (count = 1; count <= 10; count++) {
            System.out.println(count);
        }


        /*
        [문제 2] 짝수 출력
            num이라는 변수를 사용하여 짝수 출력
         */
        // #1 while문
        int num = 1;
        int count1 = 1;

        while (count1 <= 10) {
            int num2 = num % 2;
            if (num2 != 0) {
                num++;
                continue;
            }
            count1++;
            System.out.println(num);
            num++;
        }

        // #2 for문
        count = 1;
        for (num = 1; count <= 10; num++) {
            int num3 = num % 2;
            if (num3 != 0) {
                continue;
            }
            System.out.println(num);
            count++;
        }


        /*
        [문제 3] 누적 합 계산
            1부터 max까지의 합을 계산하고 출력
            sum = 누적합
            i = 1부터 max까지 증가하는 변수
         */
        // #1 while문
        int sum = 0;
        int i = 1;
        int max = 100;

        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println(sum);

        // #2 for문
        sum = 0;
        for (i = 1; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);


        /*
        [문제 4] 구구단 출력
         */
        // #1 중첩 for문
        for (i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }

        // #2 중첩 while문
        i = 1;
        while (i <= 9) {
            int j = 1;
            while (j <= 9) {
                System.out.println(i + " * " + j + " = " + i*j);
                j++;
            }
            i++;
        }

        /*
        [문제 5] 피라미드 출력
         */
        // #1 for문
        int rows = 2;

        for (i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*
            (1) for문-1의 조건식이 참인지 확인         i(1) <= row(2) : ture

            (2) for문-2의 조건식이 참인지 확인         j(1) <= i(1)   : true
            (3) "*"출력
            (4) for문-2                            j = j(1) + 1     j = 2
            (5) for문-2의 조건식이 참인지 확인         j(2) <= i(1)    : false
            (6) for문-1로 돌아가기

            (7) for문-1                            i = i(1) + 1     i = 2
            (8) for문-1의 조건식이 참인지 확인         i(2) <= row(2) : true

            (9) for문-2의 조건식이 참인지 확인         j(1) <= i(2)   : true
            (10) "*"출력
            (11) for문-2                            j = j(1) + 1     j = 2
            (12) for문-2의 조건식이 참인지 확인         j(2) <= i(2)    : true
            (13) "*"출력 - print라서 옆에 출력
            (14) for문-2                            j = j(2) + 1     j = 3
            (15) for문-2의 조건식이 참인지 확인         j(3) <= i(2)    : false
            (16) for문-1로 돌아가기

            (17) for문-1                            i = i(2) + 1     i = 3
            (18) for문-1의 조건식이 참인지 확인         i(3) <= row(2) : false

            (19) 반복문 종료
         */

        // #2 while문
        rows = 5;
        i = 1;

        while (i <= rows) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
