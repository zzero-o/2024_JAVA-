package scope_casting_6;

// 형변환
// 계산과 형변환
public class Casting2_240112 {
    public static void main(String[] args) {
        // (1) int형과 int형의 계산 + 계산결과 int형
        int div1 = 3 / 2;
        System.out.println("div1 = " + div1);
        // 출력 : 1

        // (2) int형과 int형의 계산 + 계산결과 double형
        double div2 = 3 / 2;
        System.out.println("div2 = " + div2);
        // 출력 : 1.0

        // (3) double형과 int형의 계산 + 계산결과 double형
        double div3 = 3.0 / 2;
        System.out.println("div3 = " + div3);
        // 출력 : 1.5
        // double + int     =>      double + double (자동 형변환)

        // (4) double형으로 형변환한 int형의 계산 + 계산결과 double형
        double div4 = (double) 3 / 2;
        System.out.println("div4 = " + div4);
        // 출력 : 1.5
        // (double) int / (double) int      =>      명시적 형변환 

        /*
            - 같은 타입끼리의 계산은 같은 타입의 결과를 낸다
            - 서로 다른 타입의 계산은 큰 범위로 자동 형변환이 일어난다
         */
    }
}
