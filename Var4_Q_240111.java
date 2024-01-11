package variable_2;

// 문제 풀이
public class Var4_Q_240111 {
    public static void main(String[] args) {
        // [문제 1] 변수 num1, num2를 사용하여 출력하기
        int num1 = 4, num2 = 3;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);

        /*
        [문제 2] 변수 num1에는 10, 변수 num2에는 20을 할당하고, 두 변수의 합을 구한 뒤,
                그 결과를 새로운 변수 sum에 저장하고 출력하기
         */
        num1 = 10;
        num2 = 20;
        int sum = num1 + num2;

        System.out.println(sum);

        /*
        [문제 3] long 타입의 변수를 선언하고, 그 변수를 100억으로 초기화한 후,
                출력하는 프로그램을 작성하기
                boolean 타입의 변수를 선언하고, 그 변수를 true로 초기화한 후,
                출력하는 프로그램을 작성하기
         */
        long l = 10000000000L;
        boolean bool = true;

        System.out.println(l);
        System.out.println(bool);
    }
}