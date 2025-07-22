
    import java.util.*;

    public class Main {
        static ArrayList<Integer>[] graph;
        static boolean[] visited;

        public static void main(String[] args) {
            /*
            문제정의: 방향 없는 그래프가 주어질 때 연결요소 개수 구하는 프로그램 작성
               - 첫째 줄에 정점 개수 N과 간선 M이 주어짐
               - 둘째줄부터 M개의 줄에, 간선의 양 끝점 u와 v가 주어진다.
             */

            /*
            1. 연결요소는 모든 정점이 서로 도달 가능한 정점들의 모임
            2. 탐색이 끝날때마다 연결 요소 ++
             */

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int m = sc.nextInt();
            graph = new ArrayList[n + 1];
            visited = new boolean[n + 1];

            for (int i = 1; i <= n; i++) {
                graph[i] = new ArrayList<>();
            }

            for (int i = 0; i < m; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                graph[u].add(v);
                graph[v].add(u);
            }

            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (!visited[i]) {
                    dfs(i);
                    count++;
                }
            }
            System.out.println(count);

        }

        private static void dfs(int node) {
            visited[node] = true;
            for (int neighbor : graph[node]) {
                if (!visited[neighbor]) {
                    dfs(neighbor);
                }
            }
        }
    }