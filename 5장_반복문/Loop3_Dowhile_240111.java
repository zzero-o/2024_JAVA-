package loop_5;

// 반복문
// do-while문 (조건에 성립하지 않아도 무조건 한번은 출력하고 싶을 때)
public class Loop3_Dowhile_240111 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 6;
        do {
            sum += i;
            System.out.println("i = " + i + " , sum = " + sum);
            i++;
        } while (i <= 5);
    }
}
