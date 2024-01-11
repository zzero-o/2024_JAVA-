package condition_4;

// Swich문
// #1 else if문
// #2 과거 Switch
// #3 현재 Switch
public class Cond_Switch1_240111 {
    public static void main(String[] args) {
        /*
        [예제 1] 회원 등급에 따라 다른 쿠폰을 발급하는 프로그램
           int grade라는 변수를 사용하며 회원 등급(grade)에 따라 쿠폰 발급
                1등급 : 쿠폰 1000
                2등급 : 쿠폰 2000
                3등급 : 쿠폰 3000
                위의 등급이 아닐 경우 쿠폰 500
         */

        // #1
        int grade = 2; // 등급 변수 선언 및 초기화
        int coupon = 0; // 쿠폰 변수 선언 및 초기화

        if (grade == 1) {
            coupon = 1000;
            System.out.println("발급 받은 쿠폰 " + coupon);
        } else if (grade == 2) {
            coupon = 2000;
            System.out.println("발급 받은 쿠폰 " + coupon);
        } else if (grade == 3) {
            coupon = 1000;
            System.out.println("발급 받은 쿠폰 " + coupon);
        } else {
            coupon = 500;
            System.out.println("발급 받은 쿠폰 " + coupon);
        }


        // #2
        switch (grade) {
            case 1: // grade가 1인 경우
                // break 문
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default: // else와 같은 기능
                coupon = 500;
                break;
        }

        System.out.println("발급받은 쿠폰 " + coupon);


        // #2 (break문이 없는 경우)
        // [예제 1 - 1] 2등급도 3등급과 같이 3000원인 쿠폰을 준다
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
                break;
        }

        System.out.println("발급받은 쿠폰 " + coupon);


        // #3
        /*
        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500
        }
         */
    }
}
