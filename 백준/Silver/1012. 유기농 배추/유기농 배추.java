
    import java.util.*;

    public class Main {
        static int[][] field;
        static boolean[][] visited;
        static int M, N;
        static int[] dx = {0, 0, -1, 1};
        static int[] dy = {-1, 1, 0, 0};

        public static void main(String[] args) {
            /*
            문제정의: 배추가 심어진 곳을 1로 표시함, 지렁이 수 구하기
             */

            /*
            1. 테스트 케이스마다 2차원 배열, 배추 심어진 곳은 1
            2. dfs 탐색이 끝날때마다 ++
             */

            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt(); 

            while (T-- > 0) {
                M = sc.nextInt(); 
                N = sc.nextInt();
                int K = sc.nextInt(); 
                field = new int[N][M];
                visited = new boolean[N][M];

                for (int i = 0; i < K; i++) {
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    field[y][x] = 1;
                }

                int wormCount = 0;
                for (int y = 0; y < N; y++) {
                    for (int x = 0; x < M; x++) {
                        if (field[y][x] == 1 && !visited[y][x]) {
                            dfs(x, y);
                            wormCount++;
                        }
                    }
                }
                System.out.println(wormCount);
            }
        }

        public static void dfs(int x, int y) {
            visited[y][x] = true;

            for (int dir = 0; dir < 4; dir++) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if (nx >= 0 && ny >= 0 && nx < M && ny < N) {
                    if (field[ny][nx] == 1 && !visited[ny][nx]) {
                        dfs(nx, ny);
                    }
                }
            }
        }
    }