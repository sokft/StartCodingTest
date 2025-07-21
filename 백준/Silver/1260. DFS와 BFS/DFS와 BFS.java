
    import java.util.*;

    public class Main {
        static boolean[] visited;
        static List<Integer>[] graph;



        public static void main(String[] args) {
            /*
            문제 정의 : 정점 갯수 N, 간선 갯수 M, 시작할 정점 번호 V가 주어짐
             */

            /*
            첫째줄에는 DFS결과
            둘째줄에는 BFS결과
             */

            Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();
            int M = sc.nextInt();
            int V = sc.nextInt();

            graph = new ArrayList[N+1];

            for (int i = 1; i <=N; i++) {
                graph[i] = new ArrayList<>();
            }
            for (int i = 0; i < M; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                graph[u].add(v);
                graph[v].add(u);
            }

            for (int i = 1; i <= N; i++) Collections.sort(graph[i]);

            visited = new boolean[N + 1];
            dfs(V, visited, graph);
            System.out.println();

            visited = new boolean[N + 1];
            bfs(V, visited, graph);

        }
        static void dfs(int v, boolean[] visited, List<Integer>[] graph) {
            visited[v] = true;
            System.out.print(v + " ");
            for (int next : graph[v]) {
                if (!visited[next]) dfs(next, visited, graph);
            }
        }

        static void bfs(int v, boolean[] visited, List<Integer>[] graph) {
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(v);
            visited[v] = true;

            while (!queue.isEmpty()) {
                int cur = queue.poll();
                System.out.print(cur + " ");
                for (int next : graph[cur]) {
                    if (!visited[next]) {
                        visited[next] = true;
                        queue.offer(next);
                    }
                }
            }
        }


    }