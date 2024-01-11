package variable_2;

// 지역 변수 사용
// 변수 : 변할 수 있는 수
// 지역 변수 : 개발자가 직접 초기화를 해주어야 하는 변수

// #1 10을 세 번 출력하는 프로그램
// #2 변수 값 변경
// #3 변수 선언 및 초기화
public class Var2_240111 {
    public static void main(String[] args) {
        // #1
        int a; // 정수를 담는 변수 선언 (그릇을 만든다)
        a = 10; // 변수에 값 대입 (그릇에 밥을 담는다)
                // 변수 초기화 : 선언한 변수에 처음으로 값을 대입해서 저장하는 것

        /*
        출력되는 숫자를 바꾸고 싶을 때, 변수 값만 변경하면 된다
         */

        System.out.println(a);
        // 변수 a에 저장되어 있는 값을 읽고 출력
        System.out.println(a);
        System.out.println(a);


        // #2
        int b; //변수 b 선언
        b = 20; //변수 초기화 (처음 값 입력)

        System.out.println(b); // b의 값 출력 b = 20

        b = 30; // 변수 값 변경 (20 -> 30)
        System.out.println(b); // b의 값 출력 b = 30


        // #3
        // (1) 변수 선언과 초기화를 각각 따로 하는 방법
        int c;
        c = 1;
        System.out.println(c);

        // (2) 변수 선언과 초기화를 동시에 하는 방법
        int d = 2;
        System.out.println(d);

        //(3) 여러 변수 선언과 초기화를 동시에 하는 방법
        int e = 3, f = 4;
        System.out.println(e);
        System.out.println(f);
    }
}
