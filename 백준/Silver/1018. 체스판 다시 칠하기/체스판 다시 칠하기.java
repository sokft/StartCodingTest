
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        문제 정의: M*N크기 보드에서 색을 최소로만 바꿔도 되는 8*8 정사각형을 잘라내서 바꿔야할 색의 수를 구하기

        문제 풀이
        1. 2차원 배열 선언하고 넣기?
        2. 그리고, 8*8만큼 자르고 시작에 따라서 B, W 번갈아가며 되는지 체크 만약 만약 규칙 따르지 않는다면 count++
        3. 그리고 나온 결과에서 최솟값을 빼서 print
         */

        Scanner sc = new Scanner(System.in);
        int count = 0;
        int col = sc.nextInt();
        int row = sc.nextInt();

        //1. 배열 선언
        char[][] board = new char[col][row];
        for (int i = 0; i < col; i++) {
            String line = sc.next();
            for (int j = 0; j < row; j++) {
                board[i][j] = line.charAt(j);
            }
        }


        //2. 8*8만큼 자르고, B,W만큼 체크되는지 체크

        int result = Integer.MAX_VALUE; // 최소 변경 횟수를 저장할 변수, 가능한 가장 큰 값으로 초기화
        for (int x = 0; x <= col-8; x++) {
            for (int y = 0; y<= row - 8; y++) {
                int w_start = 0;
                int b_start = 0;

                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        char current = board[x + i][y + j];

                        char expectedW = ((i + j) % 2 == 0) ? 'W' : 'B';  // 'W'부터 시작할 경우
                        char expectedB = ((i + j) % 2 == 0) ? 'B' : 'W';  // 'B'부터 시작할 경우

                        if (current != expectedW) w_start++;
                        if (current != expectedB) b_start++;
                    }
                }

                int minresult = Math.min(w_start, b_start);
                result = Math.min(result, minresult);
            }
        }

//3. 나온 결과에서 최솟값 빼서 print
        System.out.println(result);


    }
}

