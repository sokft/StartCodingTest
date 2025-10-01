import java.util.Scanner;
public class Main {
    static final int OFFSET = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n개의 사각형
        int n = sc.nextInt();


        // 1. 사각형 배열 만들기
        boolean[][] space = new boolean[201][201];

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    space[x][y] = true;
                }
            }
        }
        
        int totalArea = 0;
        for (int i = 0; i < 201; i++) {
            for (int j = 0; j < 201; j++) {
                if (space[i][j]) {
                    totalArea++;
                }
            }
        }

        System.out.println(totalArea);
        sc.close();
        
    }
}