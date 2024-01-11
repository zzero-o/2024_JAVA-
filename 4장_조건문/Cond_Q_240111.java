package condition_4;

// 문제 풀이
public class Cond_Q_240111 {
    public static void main(String[] args) {
        /*
        [문제 1] 학점 계산하기
            90점 이상 : "A"
            80점 이상 90점 미만 : "B"
            70점 이상 80점 미만 : "C"
            60점 이상 70점 미만 : "D"
            60점 미만 : "F"
         */

        int score = 95; // 변수 선언 및 초기화
        String grade;
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80 && score < 90) {
            grade = "B";
        } else if (score >= 70 && score < 80) {
            grade = "C";
        } else if (score >= 60 && score < 70) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("학점은 " + grade + "입니다.");


        /*
        [문제 2] 거리에 따른 운송 수단 선택하기
            거리가 1km 이하 : "도보"
            거리가 10km 이하 : "자전거"
            거리가 100km 이하 : "자동차"
            거리가 100km 초과 : "비행기"
         */

        int distance = 8; // 거리 변수 선언 및 초기화
        String vehicle;

        if (distance <= 1) {
            vehicle = "도보";
        } else if (distance <= 10) {
            vehicle = "자전거";
        } else if (distance <= 100) {
            vehicle = "자동차";
        } else {
            vehicle = "비행기";
        }

        System.out.println(vehicle + "를 이용하세요.");


        /*
        [문제 3] 환율 계산하기
            달러가 0 미만 : "잘못된 금액입니다"
            달러가 0 : "환전할 금액이 없습니다"
            달러가 0 초과 : "환전 금액은 (계산된 원화 금액)원입니다"
         */

        int dollar = 10; // 달러 변수 선언 및 초기화
        int won = dollar * 1300;

        if (dollar < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            System.out.println("환전 금액은 " + won + "원입니다.");
        }


        /*
        [문제 4] 평점에 따른 영화 추천하기
            어바웃 타임 - 평점 9
            토이스토리 - 평점 8
            고질라 - 평점 7
         */

        double rating = 5;

        // #1 else if 문
        if (rating >= 7) {
            System.out.println("'어바웃타임'을 추천합니다.");
            System.out.println("'토이스토리'를 추천합니다.");
            System.out.println("'고질라'를 추천합니다.");
        } else if (rating >= 8) {
            System.out.println("'어바웃타임'을 추천합니다.");
            System.out.println("'토이스토리'를 추천합니다.");
        } else if (rating >= 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        } else {
            System.out.println("추천할 영화가 없습니다.");
        }

        // #2 if문
        rating = 7.1;
        if (rating <= 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        }
        if (rating <= 8) {
            System.out.println("'토이스토리'를 추천합니다.");
        }
        if (rating <= 7) {
            System.out.println("'고질라'를 추천합니다.");
        }


        /*
        [문제 5] 학점에 따른 성취도 출력하기
            A : 탁월한 성과입니다!
            B : 좋은 성과입니다!
            C : 준수한 성과입니다!
            D : 향상이 필요합니다.
            F : 불합격입니다.
            나머지 : 잘못된 학점입니다.
         */

        // #1 else if문
        String score1 = "F";

        if (score1 == "A") {
            System.out.println("탁월한 성과입니다!");
        } else if (score1 == "B") {
            System.out.println("좋은 성과입니다!");
        } else if (score1 == "C") {
            System.out.println("준수한 성과입니다!");
        } else if (score1 == "D") {
            System.out.println("향상이 필요합니다.");
        } else if (score1 == "F") {
            System.out.println("불합격입니다.");
        } else {
            System.out.println("잘못된 학점입니다.");
        }

        // #2 Switch문
        score1 = "B";
        switch (score1) {
            case "A" :
                System.out.println("탁월한 성과입니다!");
                break;
            case "B" :
                System.out.println("좋은 성과입니다!");
                break;
            case "C" :
                System.out.println("준수한 성과입니다!");
                break;
            case "D" :
                System.out.println("향상이 필요합니다.");
                break;
            case "F" :
                System.out.println("불합격입니다.");
                break;
            default :
                System.out.println("잘못된 학점입니다");
                break;
        }


        /*
        [문제 6] 더 큰 숫자 찾기
            a = 10, b = 20
         */

        int a = 10, b= 20;
        int result;

        // #1 if문
        if (a > b) {
            result = a;
        } else {
            result = b;
        }

        System.out.println("더 큰 숫자는 " + result + "입니다.");

        // #2 삼항 연산자
        int result1 = (a > b) ? a : b;

        System.out.println("더 큰 숫자는 " + result1 + "입니다.");
    }
}
