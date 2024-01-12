package array_8;

// 배열
// 향상된 for문

// #1 [예제] 일반 for문
// #2 [예제] for-each문
// #3 향상된 for문을 사용하지 못하는 경우
public class Array3_For_240112 {
    public static void main(String[] args) {
        /*
            [향상된 for문 정의]
            for (변수 : 배열 또는 컬렉션) {
            // 배열 또는 컬렉션의 요소를 순회하면서 수행할 작업
         */


        // #1
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++){
            int number = numbers[i];
            System.out.println(number);
        }


        // #2
        //  [단축키] iter + Enter키
        for (int number : numbers) {
            // 해당 배열(numbers)을 처음부터 끝까지 탐색
            System.out.println(number);
        }


        // #3
        // 증가하는 인덱스 값이 필요한 경우
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println("number" + i + "번의 결과는 : " + numbers[i]);
        }
    }
}
