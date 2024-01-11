package condition_4;

// 조건문
// 삼항 연산자
// #1 if문
// #2 삼항연산자
public class Cond_Triplet_240111 {
    public static void main(String[] args) {
        // #1
        int age = 18;
        String status;

        if (age >= 18) {
            status = "성인";
        } else {
            status = "미성년자";
        }

        System.out.println("나이는 " + age + " " + status);


        // #2
        String status2 = (age >= 18) ? "성인" : "미성년자";
        /*
            항이 3개라 삼항 연산자 = ? :
            변수 = (조건) ? 참일 때 값 : 거짓일 때 값
         */
        System.out.println("나이는 " + age + " " + status);
    }
}
