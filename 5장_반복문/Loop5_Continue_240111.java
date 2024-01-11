package loop_5;

// 반복문
// continue (반복문의 나머지 부분을 건너뛰고 다음 반복으로 진행)
public class Loop5_Continue_240111 {
    public static void main(String[] args) {
        //[예제 1] 1부터 5까지 숫자를 출력하는데, 숫자가 3일 때는 출력을 건너뛰어야 한다
        int i = 1;

        while (i < 6) {
            if (i == 3) {
                i++;
                continue;
            } else {
                System.out.println("i = " + i);
                i++;
            }
            /*
                (1) while 조건식이 참인지 확인       i(1) < 6 : true
                (2) if 조건식이 참인지 확인          i(1) == 3 : false
                (3) else문 실행 - 출력, i++          i = i(1) + 1        i = 2
                    출력 : i = 1

                (4) while 조건식이 참인지 확인       i(2) < 6 : true
                (5) if 조건식이 참인지 확인          i(2) == 3 : false
                (6) else문 실행 - 출력, i++          i = i(2) + 1        i = 3
                    출력 : i = 2

                (7) while 조건식이 참인지 확인       i(3) < 6 : true
                (8) if 조건식이 참인지 확인          i(3) == 3 : true
                (9) if문 실행 -- i++               i = i(3) + 1          i = 4
                (10) if문 실행 -- continue (while조건식으로 넘어간다)

                (11) while 조건식이 참인지 확인      i(4) < 6 : true
                (12) if 조건식이 참인지 확인         i(4) == 3 : false
                (13) else문 실행 - 출력, i++         i = i(4) + 1        i = 5
                    출력 : i = 4

                (14) while 조건식이 참인지 확인      i(5) < 6 : true
                (15) if 조건식이 참인지 확인         i(5) == 3 : false
                (16) else문 실행 - 출력, i++         i = i(5) + 1        i = 6
                    출력 : i = 5

                (17) while 조건식이 참인지 확인      i(6) < 6 : false
                (18) 반복문 종료
             */
        }
    }
}
