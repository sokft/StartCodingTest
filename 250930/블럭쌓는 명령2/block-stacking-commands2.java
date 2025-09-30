import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 7번째 칸
        int N = sc.nextInt();

        // 몇번 놓는지
        int K = sc.nextInt();

        int[] arr = new int[7];

        for (int i = 0; i < K; i++) {

            //A~B까지 ++
            int A = sc.nextInt();
            int B = sc.nextInt();

            for (int j = A; j <= B; j++) {
                arr[A-1] += 1; 
            }

        }
        // 최댓값 뽑기
        Arrays.sort(arr);
        System.out.println(arr[N-1]);
    }
}