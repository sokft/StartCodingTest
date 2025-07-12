
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        문제 정의: N*M크기 직사각형, 꼭짓점이 같은 정사각형을 잘라서 가장 큰 크기 반환
         */

        /*
        문제 풀이
        1. 직사각형을 2차원 배열에 넣기
        2. 그리고 반복문 돌면서 정사각형을 계속 크게 잘라가기. 2*2, 3*3, 4*4 & 꼭짓점 확인
        3. 여기서 가장 큰 정사각형 크기 반환
         */

        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt();
        int row = sc.nextInt();

        // 1. 직사각형 만들기
        int[][] arr = new int[col][row];
        for (int i = 0; i< col; i++) {
            String line = sc.next();
            for (int j=0; j < row; j++) {
                arr[i][j] = line.charAt(j) -'0';
            }
        }

        // 2. 반복문 돌면서 2*2, 3*3, 4*4 자르면서 꼭짓점 확인하기
        int minimum = Math.min(col, row);
        int result = 1;

            //정사각형 크기(i) 반복문
            for (int i = 1; i < minimum; i++) {
                if (minimum == 1) {
                    System.out.println(1);
                    break;
                }
                // 정사각형 크기를 바탕으로 직사각형 이동하기 & 끝까지 이동하면 끝내야함
                for (int x = 0; x + i < col; x++) {
                    for (int y = 0; y + i < row; y++) {

                        if( (arr[x][y] == arr[x+i][y]) && (arr[x][y+i] == arr[x+i][y+i])
                        && (arr[x][y] == arr[x][y+i])) {
                            result = Math.max(result, (i+1)*(i+1));
                        }
                    }
                }
            }
        System.out.println(result);

    }
}

