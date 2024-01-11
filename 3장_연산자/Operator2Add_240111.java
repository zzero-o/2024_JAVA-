package operator_3;

// 연산자
// 증감 연산자
public class Operator2Add_240111 {
    public static void main(String[] args) {
        int a = 0; // 변수 선언 및 초기화

        a = a + 1; /* (1) a에 0이 있는 걸 인지
                      (2) 0(a)과 1을 더함 => 1
                      (3) 1(결과값)을 다시 변수 a에 넣음*/
        System.out.println(a);

        // 증감 연산자 (+) 사용
        ++a; // a = a + 1과 같다
        System.out.println(a);

        // 증감 연산자 (-) 사용
        --a; // a = a - 1과 같다
        System.out.println(a);



        // 전위 증감 연산자 사용 예 (++a)
        int b = 0; // 변수 선언 및 변수 초기화
        a = 1; // 변수 값 재 설정

        b = ++a; // 변수 값 재 설정
        /*
            (1) a에 있는 값(1) 인식
            (2) a = a + 1 실행    => a에 2라는 값 재 설정
            (3) 변수 b에 a에 있는 값(2)를 넣는다
         */
        System.out.println("a = " + a + ", b = " + b);
        // 결과 : a = 2, b = 2



        // 후위 증감 연산자 사용 예 (a++)
        b = 0; // 변수 값 재 설정
        a = 1; // 변수 값 재 설정

        b = a++;
        /*
            (1) a에 있는 값(1) 인식
            (2) 변수 b에 a에 있는 값(1) 대입
            (3) a = a + 1 실행    => a에 2라는 값 재 설정
         */
        System.out.println("a = " + a + ", " + "b = " + b);
        // 결과 a = 2, b = 1
    }
}
