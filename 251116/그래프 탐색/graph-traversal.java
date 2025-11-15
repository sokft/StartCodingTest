import java.util.Scanner;
public class Main {
    static int[][] arr;
    static boolean[] visited;
    static int cnt = 0;
    static int n,m;


    public static void main(String[] args) {
        /*
            1. 일단 배열에 담기
            2. 
        */
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] u = new int[m];
        int[] v = new int[m];
        arr = new int[n+1][n+1];
        visited = new boolean[n+1];

        for (int i = 0; i < m; i++) {
            u[i] = sc.nextInt();
            v[i] = sc.nextInt();
            // 1, 2 -> 배열은 0부터라서 주의하기
            arr[u[i]][v[i]] = 1;
            arr[v[i]][u[i]] = 1;
        }
        // Please write your code here.
        DFS(1);
        System.out.println(cnt - 1);
    }

    public static void DFS(int v) {
        visited[v] = true;
        cnt++;
        for(int i = 1; i <= n; i++) {
            if(arr[v][i] == 1 && !visited[i]) {
                DFS(i);
            }
        }

    }
}