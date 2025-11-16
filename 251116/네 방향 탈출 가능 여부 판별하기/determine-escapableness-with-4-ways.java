import java.util.*;

public class Main {
    /*
        1, Pair클래스 생성
        2. dx, dy tech
        3. inRange 구현
        4. BFS사용해서 확인.
    */

    // 전역 변수 설정
    static int n;
    static int m;
    static int[][] grid;
    static boolean[][] visited;
    static int[][] dist;

    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,-1,0,1};


    //Pair클래스 생성
    static class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    // 범위 체크 메서드
    static boolean inRange(int x, int y) {
         return x >= 0 && x < n && y >= 0 && y < m;
    }

    // 이동 가능 확인 메서드
    static boolean canGo(int x, int y) {
            return inRange(x,y) && grid[x][y] == 1 && !visited[x][y];
    }

    //bfs
    static void bfs(int x, int y) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(x,y));
        visited[x][y] = true;
        dist[x][y] = 0;

        while(!q.isEmpty()) {
            Pair curr = q.poll();
            int ax = curr.x;
            int ay = curr.y;

            for (int i = 0; i < 4; i++) {
                int nx = ax +dx[i];
                int ny = ay + dy[i];

                if(canGo(nx,ny)) {
                    q.add(new Pair(nx,ny));
                    visited[nx][ny] = true;
                    dist[nx][ny] = dist[ax][ay] + 1;

                }
            }
        }

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][m];
        dist = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
                dist[i][j] = -1;
            }
        }
        // Please write your code here.
        bfs(0,0);
        int result = 0;
        if (dist[n-1][m-1] > 1) result = 1;
        System.out.println(result);
    }
}