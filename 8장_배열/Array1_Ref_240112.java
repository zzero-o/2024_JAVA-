package array_8;

// 배열
// 1차원 배열
// #1 배열 개념
// #2 배열 리펙토링 (작동하는 기능은 같은데, 코드를 개선)
public class Array1_Ref_240112 {
    public static void main(String[] args) {
        // #1
        // (1) 배열 변수 선언
        int[] student;      // (긴 그릇을 가져왔다)

        // (2) 배열 생성
        student = new int[5];    // (긴 그릇을 다섯개의 칸으로 나눈다)
                                // (생성된 배열의 참조값(주소)를 student에 부여 = 그릇 위치가 student)

        // (3) 배열 사용 (인덱스)
        /*
            - 배열(인덱스)은 0부터 시작한다
            student = new int[5]        = 0 ~ 4
         */

        // (4) 데이터 타입
        /*
            - 기본형 : 사이즈가 명확하게 정해져 있다 (빠르고 메모리를 효율적으로 처리)
                ex) int, boolean, double, long
            - 참조형 : 동적으로 사이즈 변경 (복잡한 데이터 구조를 만들고 관리)
                ex) 객체, 클래스 담을 수 있는 변수, 배열
         */


        // #2 (변수 값 사용)
        int[] students; // 배열 변수 선언
        students = new int[5]; // 배열 생성

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 변수 값 사용
        for(int i = 0; i < students.length; i++){
            System.out.println("학생" + (i + 1) + " 점수 : " + students[i]);
        }


        // #2 (초기화)
        students = new int[]{90, 80, 70, 60, 50};

        for (int i = 0; i < student.length; i++){
            System.out.println("학생" + (i + 1) + " 점수 : " + students[i]);
        }

        int[] studentss = {90, 80, 70, 60, 50};

        for (int i = 0; i < student.length; i++){
            System.out.println("학생" + (i + 1) + " 점수 : " + studentss[i]);
        }
    }
}
