package scope_casting_6;

// 형변환
// #1 자동 형변환 (묵시적 형변환)
// #2 명시적 형변환
// #3 오버플로우
public class Casting1_240112 {
    public static void main(String[] args) {
        // #1
        // 작은 범위에서 큰 범위로의 대입
        int intValue = 10; // 작은 범위
        long longValue; // 큰 범위
        double doubleValue; // 가장 큰 범위

        // int -> long (작은 범위 -> 큰 범위)
        longValue = intValue;
        System.out.println("longValue = " + longValue);

        // int -> double (작은 범위 -> 가장 큰 범위)
        doubleValue = intValue;
        System.out.println("doubleValue1 = " + doubleValue);

        // long -> doubleValue (큰 범위 -> 가장 큰 범위)
        doubleValue = 20L; // 20L = longValue
        System.out.println("doubleValue2 = " + doubleValue);


        // 대입할 시 형 맞추기
        doubleValue = intValue; // double형에 int형 대입
        /*
            (1) intValue의 값이 무엇인지 읽기              10
            (2) 읽은 값을 자동으로 double형에 대입          double = 10
            (3) 변수 읽기                                10.0
         */
        System.out.println("doubleValue3 = " + doubleValue);


        // #2
        // 큰 범위에서 작은 범위의 대입
        doubleValue = 1.9;
        intValue = 0;

        intValue = (int) doubleValue; // 실수형(double형)을 정수형(int형)으로 형 변환하여 읽기
                                    // 1.9 (소수점 이하 버림)
                                    // 1 (정수형) 출력
        System.out.println(intValue);


        // #3
        long maxIntValue = 2147483647; // int형의 최고값
        long maxIntOver = 2147483648L; // int형의 최고값에서 1초과
        intValue = 0;

        intValue = (int) maxIntValue; // long형을 int형으로 변환
        System.out.println("maxIntValue = " + intValue);

        // 오버플로우의 경우
        intValue = (int) maxIntOver; // lomg형을 int형으로 변환
        System.out.println("maxIntOver = " + intValue);
        // 시계가 한 바퀴 돈 것처럼 다시 처음부터 시작
    }
}
