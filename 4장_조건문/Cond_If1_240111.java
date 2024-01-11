package condition_4;

// 조건문

// 나이 판정
// #1 if문
// #2 else문
// #3 else-if 문
public class Cond_If1_240111 {
    public static void main(String[] args) {
        // #1 (if만 사용하여 나이 판정)
        int age = 22; // 변수 선언 및 초기화

        if (age >= 18) {
            System.out.println("성인입니다");
        } // ()안에 조건이 참일 경우, "성인입니다" 출력
          // 18보다 크거나 같은 경우 성인
        if (age < 18) {
            System.out.println("미성년자입니다");
        }


        // #2 (if와 else를 사용하여 나이 판정)
        age = 17;

        if (age >= 18) {
            System.out.println("성인입니다");
            /*
                (1) ()안의 조건이 참인지 확인
                    1. age에 17이 있는 것을 인지
                    2. age (17) >= 18   : 17은 18보다 작거나 같지 않다
                    3. ()안의 조건은 false
                (2) {}안의 내용 패스
                (3) else로 넘어감
             */
        } else {
            System.out.println("미성년자입니다");
            /*
                (4) {} 안의 내용 확인
                (5) 미성년자입니다 출력
             */
        }


        // #3
        int age1 = 14; // 변수 선언 및 초기화

        if (age1 <= 7) {
            System.out.println("미취학");
        } else if (age1 >= 8 && age1 <= 13) {
            // if문에서 false 값이 나오고 else if 1에서 참일 때
            System.out.println("초등학생");
        } else if (age1 >= 14 && age1 <= 16) {
            // else if 1에서 false 값이 나오고 else if 2에서 참일 때
            System.out.println("중학생");
        } else if (age1 >= 17 && age1 <= 19) {
            // else if 2에서 false 값이 나오고 else if 3에서 참일 때
            System.out.println("고등학생");
        } else {
            // 모든 if, else if 조건에 부합하지 않을 때
            System.out.println("성인");
        }
    }
}
