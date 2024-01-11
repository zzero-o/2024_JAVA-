package operator_3;

// 연산자
// 논리 연산자 : boolean형 비교 = 결과 값도 boolean
public class Operator4Logic_240111 {
    public static void main(String[] args) {
        // (1) && (AND 연산자) - 하나라도 false면 false
        System.out.println(true && true); // 둘다 true : true
        System.out.println(false && true); // 하나만 false : false
        System.out.println(false && false); // 둘다 false : false

        // (2) || (OR 연산자) - 하나라도 true면 true
        System.out.println(true || true); // 둘 다 true : true
        System.out.println(false || true); // 하나만 true : true
        System.out.println(false || false); // 둘다 false : false

        // (3) ! (부정 연산자) - 반대로 출력
        System.out.println(!true); // false
        System.out.println(!false); // true


        // 논리 연산자와 비교연산자의 활용
        int a = 15;
        System.out.println(a > 10 && a < 20);
        /*
            (1) a에 들어있는 값 (15) 인식
            (2) [비교연산자] 우선
                a > 10 (15 > 10) : true
                a < 20 (15 < 20) : true
            (3) [논리연산자] 우선
                true && true
            (4) true 출력
         */
    }
}
