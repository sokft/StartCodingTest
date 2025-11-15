import java.util.Scanner;
public class Main {
    /*
        1. 격자를 배열에 다 넣기
        2. 3*3씩 잘라가면서 동전 최대갯수 갱신
        3. inRange함수도 계속 써야함
    */
    public static final int min = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];

        // 격자만듦
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        // 이제 3*3검사하면서 갯수세기
        int result = min;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k< 3; k++) {
                    for(int l = 0; l < 3; l++) {
                        if(inRange(n, i+k, j+l) && grid[i + k][j + l] == 1) {
                            cnt++;
                        }
                    }
                    
                }
                result = Math.max(cnt, result);
                cnt = 0;
            }
        }
        System.out.println(result);
    }

    public static boolean inRange(int n, int x, int y) {
        boolean result = false;
        if(x < n && x >=0 && y < n && y>=0) {
            result = true;
        }
        return result;
    }
}