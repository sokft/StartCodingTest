
    import java.util.Scanner;

    public class Main {
        static int N;
        static int[][] S;
        static boolean[] visited;
        static int minDiff = Integer.MAX_VALUE;


        public static void main(String[] args) {
            /*
            문제 정의: N명 짝수를 반으로 나눠서 스타트팀 링크팀으로 나눔.
             */

            /*
            1. 배열에 넣고
            2. N/2선택해서 능력치 합 계산?

             */

            Scanner sc = new Scanner(System.in);

            N = sc.nextInt();
            S = new int[N][N];
            visited = new boolean[N];

            // 능력치 배열 입력
            for (int i = 0; i < N; i++)
                for (int j = 0; j < N; j++)
                    S[i][j] = sc.nextInt();

            makeTeam(0, 0);

            System.out.println(minDiff);

        }
        // n명 중에서 N/2명 고르기
        static void makeTeam(int depth, int idx) {
            if (depth == N / 2) {
                calculate();
                return;
            }

            for (int i = idx; i < N; i++) {
                visited[i] = true;
                makeTeam(depth + 1, i + 1);
                visited[i] = false;
            }
        }

        // 각 팀 능력치 계산
        static void calculate() {
            int start = 0, link = 0;

            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (visited[i] && visited[j]) {
                        start += S[i][j] + S[j][i];
                    } else if (!visited[i] && !visited[j]) {
                        link += S[i][j] + S[j][i];
                    }
                }
            }

            minDiff = Math.min(minDiff, Math.abs(start - link));
        }
    }
