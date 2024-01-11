package loop_5;

// 반복문
// for문
public class Loop6_For_240111 {
    public static void main(String[] args) {
        //[예제 1] 1부터 10까지 출력하는 for문
        for (int i = 1; i <= 10; i++){
            /*
                in i = 1 : 초기값 설정
                i <= 10 : 조건식
                i++ : i를 하나씩 증가
             */
            System.out.println(i);
        }

        //[예제 2] i부터 하나씩 증가하는 수를 endNum(마지막수)까지 더하기
        // #1 for문
        int sum = 0;
        int endNum = 3;

        for (int i = 1; i <= endNum; i++) {
            sum += i;
            System.out.println("i = " + i + ", 합계 = " + sum);
        }

        // #2 while문
        int i = 1;
        sum = 0;
        while (i <= endNum) {
            sum += i;
            System.out.println("i = " + i + ", 합계 = " + sum);
            i++;
        }


        // [예제 3] 1부터 시작하여 숫자를 계속 누적해서 더하다가 합계가 10보다 큰 처음 값은 얼마인가?
        sum = 0;
        i = 1;

        for (;;) {
            //for(;;) = while(true) = 무한루프
            sum += i;
            if (sum > 10) {
                System.out.println("i = " + i + ", 합계 = " + sum);
                break;
            } else {
                i++;
            }
        }

        // 좀더 깔끔하게 적기
        sum = 0;

        for(i = 1; ; ++i) {
            sum += i;
            if (sum > 10) {
                System.out.println("i = " + i + ", 합계 = " + sum);
                break;
            }
        }
    }
}
