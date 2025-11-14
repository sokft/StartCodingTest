import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.


        int[] dx = {1,0,-1,0};
        int[] dy = {0,-1,0,1};

        int pos = 0;
        int x = 0;
        int y = 0;
        int sum = 0;
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            for(int j =0; j < n; j++) {
                x = i;
                y = j;
                cnt = 0;
                for (int dirNum = 0; dirNum < 4; dirNum++) {
                    int nx = x + dx[dirNum];
                    int ny = y + dy[dirNum];
                    if(inRange(n,nx,ny) && arr[nx][ny] == 1){
                        cnt++;
                       
                    }
                }
                 if (cnt >= 3) {
                   sum++;
                 }

            }
        }

        System.out.println(sum);
    }
    public static boolean inRange(int n ,int nx, int ny) {
        boolean x = false;
        if (nx < n && ny < n && nx >= 0 && ny >= 0) {
            x = true;
        }
        return x;
    }
}