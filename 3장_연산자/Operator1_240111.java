package operator_3;

// 연산자

/*
연산자 : 연산 기호
피연산자 : 연산 대상
 */

// #1 산술 연산자
// #2 문자열 더하기
public class Operator1_240111 {
    public static void main(String[] args) {
        // #1
        // 변수 선언 및 변수 초기화
        int a = 5;
        int b = 2;

        int sum = a + b; // 덧셈
        System.out.println("a + b = " + sum);

        int diff = a - b; // 뺄셈
        System.out.println("a - b = " + diff);

        int multi = a * b; // 곱셈
        System.out.println("a * b = " + multi);

        int div = a / b; // 나눗셈
                        // int 이기 때문에 몫만 출력
        System.out.println("a / b = " + div);

        int mod = a % b; //나머지
        System.out.println("a % b = " + mod);


        // #2
        // (1) 변수 없이 문자열 더하기
        System.out.println("Hello " + "Java");

        // (2) 변수를 이용하여 문자열 더하기
        String s1 = "Hello ", s2 = "Java";
        System.out.println(s1 + s2);

        // (3) 변수 없이 문자열과 숫자 더하기
        System.out.println(10 + "JAVA"); // java에서 숫자를 문자열로 변환해서 문자열끼리 더함

        // (4) 변수를 이용하여 문자열과 숫자 더하기
        int c = 10;
        String s3 = "JAVA";
        System.out.println(c + s3);
    }
}
