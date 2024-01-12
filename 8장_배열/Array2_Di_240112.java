package array_8;

// 배열
// 2차원 배열
// #1 2차원 배열 생성 및 사용
// #2 2차원 배열 리팩토링
public class Array2_Di_240112 {
    public static void main(String[] args) {
        // #1
        // 2x3 배열을 만든다
        int[][] arr = new int [2][3];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        System.out.print(arr[0][0] + " ");
        System.out.print(arr[0][1] + " ");
        System.out.println(arr[0][2] + " ");

        System.out.print(arr[1][0] + " ");
        System.out.print(arr[1][1] + " ");
        System.out.print(arr[1][2] + " ");
        System.out.println();


        // #2
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
