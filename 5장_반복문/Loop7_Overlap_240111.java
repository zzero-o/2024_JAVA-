package loop_5;

// 반복문
// 중첩 반복문
public class Loop7_Overlap_240111 {
    public static void main(String[] args) {
        // #1 for문
        for(int i = 0; i < 2; i++) {
            System.out.println(i + "번째 반복문");
            for(int j = 0; j < 3; j++) {
                System.out.println(j);
            }
            System.out.println(i + "번째 반복문 끝");
        }

        // #2 while문
        int i = 0;

        while (i < 2) {
            System.out.println(i + "번째 반복문");
            int j = 0;
            while (j < 3) {
                System.out.println(j);
                j++;
            }
            i++;
        }
    }
}
