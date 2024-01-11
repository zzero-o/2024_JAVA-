package operator_3;

// 연산자
// 비교 연산자 (boolean형 사용 - true, false)
// #1 숫자 비교
// #2 문자열 비교
public class Operator3Comp_240111 {
    public static void main(String[] args) {
        // #1
        int a = 2; // 변수 선언 및 변수 초기화
        int b = 3; // 변수 선언 및 변수 초기화

        System.out.println(a == b); // (a와 b는 같다) false
        System.out.println(a != b); // (a와 b는 다르다) true
        System.out.println(a > b); // (a가 b보다 크다) false
        System.out.println(a < b); // (a가 b보다 작다) true
        System.out.println(a >= b); // (a가 b보다 크거나 같다) false
        System.out.println(a <= b); // (a가 b보다 작거나 같다) true
        
        // 결과를 boolean형 변수에 담기
        boolean result1 = a==b;
        System.out.println("result1 = " + result1);


        // #2
        String str1 = "문자열1";
        String str2 = "문자열2";

        // (1) 리터럴 비교
        System.out.println("hello".equals("hello"));

        // (2) 문자열 변수와 리터럴 비교
        System.out.println(str1.equals("문자열1"));

        // (3) 문자열 변수 비교
        System.out.println(str1.equals(str2));
    }
}
