package scope_casting_6;

// 스코프 (변수의 접근가능한 범위)
public class Scope1_240112 {
    public static void main(String[] args) {
        int m = 10; // 변수 m 생존 시작
        if (true) {
            int x = 20; // 변수 x 생존 시작
            System.out.println("if m = " + m); //블록 내부에서 블록 외부 접근 가능
            System.out.println("if x = " + x);
        } // 변수 x 생존 종료
    } // 변수 m 생존 종료
}
