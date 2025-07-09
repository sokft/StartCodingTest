
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        문제
        1. 정확히 3개의 삼각수 T의 합으로 이뤄질 수 있는 수인지 증명(중복 가능)
        2. 입력은 테스트케이스의 갯수 다음에 여부 확인
        3. 출력은 true or false

        풀이
        1. 첫번째 수 만큼 첫번째 반복문 -> 배열에 케이스들 다 넣기
        2. 그리고 true,false 반환,, 함수로 분리해서?

         */
        //케이스 완성
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        int[] arr = new int[testcase];

        for (int i = 0; i < testcase; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < testcase; i++) {
                int result = inspection(arr[i]);
                System.out.println(result);
            }
    }

    //수가 맞는지 판별해줘야함 -> 반복문 돌면서 찾으면 return1
    private static int inspection(int j) {
        for (int i =1; i< j; i++) {
            for(int x = 1; x < j; x++){
                for (int y = 1; y < j; y++) {
                    int result = triangleNum(i) + triangleNum(x) + triangleNum(y);
                    if (j == result){
                        return 1;
                    }
                }
            }

        }
        return 0;
    }

    //삼각 수만들기
    private static int triangleNum(int i) {
        return i*(i+1)/2;
    }
}
