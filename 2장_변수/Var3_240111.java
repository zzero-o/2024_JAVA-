package variable_2;

// #1 변수 타입
// #2 변수 명명 규칙
public class Var3_240111 {
    public static void main(String[] args) {
        // #1
        // (1) 정수
        int a = 100; // 실무 사용

        byte by = 127; // -128 ~ 127
        short s = 32767; // 약 3만개
        int i = 20; // 약 20억개
        long l = 202020202020L; // 20억이 넘어가면 L을 붙여야 한다

        // (2) 실수
        double b = 10.5; // 실무 사용

        float f = 10.6f; // 기본이 double이기 때문에 f를 붙여준다
                        // 정밀도가 떨어진다

        // (3) boolean(불리언)
        boolean c = true; // true, false 입력 가능

        // (4) 문자 하나
        char d = 'A'; // ''써야 함, 'A' 가능, 'AB' 불가능

        // (5) 문자열
        String e = "Hello Java"; // "" 써야 함, String의 s는 무조건 대문자


        /*
        리터럴 : 개발자가 직접 적은 문자, 숫자
                ex) 100, 10.5, true, 'A', "Hello Java"
         */


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        /*
        복붙 단축키 : ctrl + d
         */


        // #2
        /*
        [규칙]
            - 변수의 이름은 숫자로 시작할 수 없다 (포함은 가능)
            - 이름에는 공백이 들어갈 수 없다
            - 자바의 예약어를 변수 이름으로 사용할 수 없다
                ex) int, class, public 등등
            - 변수 이름에는 영문자, 숫자, 달러 기호 또는 밑줄만 사용 가능
         */

        /*
        [관례]
            - 소문자로 시작하는 낙타 표기법
            - 클래스는 대문자로 시작, 나머지는 소문자로 시작
                (상수(모두 대문자), 패키지(모두 소문자) 제외)
         */
    }
}
