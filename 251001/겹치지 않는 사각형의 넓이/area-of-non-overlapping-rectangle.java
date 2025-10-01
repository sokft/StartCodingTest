import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //
        int[][] plane = new int[2001][2001];
        final int OFFSET = 1000;

        // 1단계: A, B 직사각형을 1로 표시
        for (int i = 0; i < 2; i++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    plane[x][y] = 1; // A, B는 1로 색칠
                }
            }
        }

        // 2단계: M 직사각형을 0으로 덮어쓰기(지우기)
        int mx1 = sc.nextInt() + OFFSET;
        int my1 = sc.nextInt() + OFFSET;
        int mx2 = sc.nextInt() + OFFSET;
        int my2 = sc.nextInt() + OFFSET;

        for (int x = mx1; x < mx2; x++) {
            for (int y = my1; y < my2; y++) {
                plane[x][y] = 0; // M 영역은 0으로 지우기
            }
        }

        // 3단계: 남아있는 넓이(1의 개수) 계산
        int remainingArea = 0;
        for (int i = 0; i < 2001; i++) {
            for (int j = 0; j < 2001; j++) {
                if (plane[i][j] == 1) {
                    remainingArea++;
                }
            }
        }

        System.out.println(remainingArea);
        sc.close();
    }
}