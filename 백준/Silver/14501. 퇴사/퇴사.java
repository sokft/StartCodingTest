

    import java.util.Scanner;

    public class Main {
        static int N;
        static int[] day, profit;
        static int maxProfit = 0;

        public static void main(String[] args) {
            /*
            1. N+1날에 퇴사하기때문에, 그때까지 벌 수 있는 최대 수익을 구하자

             */
            /*
            문제 풀이
            1. 계속 넣으면서 최대의 이익 계속해서 갱신하기?
            2. N보다 작은 것을 수락하기
            backTracking?
             */
            Scanner sc = new Scanner(System.in);
            N = sc.nextInt();

            day = new int[N];
            profit = new int[N];

            for (int i = 0; i< N; i++) {
                day[i] = sc.nextInt();
                profit[i] = sc.nextInt();
            }
            dfs(0,0);
            System.out.println(maxProfit);
        }
        private static void dfs(int day, int totalProfit) {
            if (day >= N) {
                maxProfit = Math.max(maxProfit, totalProfit);
                return;
            }

            if (day + Main.day[day] <= N) {
                dfs(day + Main.day[day], totalProfit + profit[day]);
            }

            dfs(day + 1, totalProfit);
        }
    }
