import java.util.Scanner;

public class Main {
    /*
    풀이
    1. 반복문을 N까지 돌리며
    2. 1000000까지니까 반복문 돌리면서 M%1000 + M%100 + M%10 + M 이런식으로 더해서 N인 경우를 찾기?
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int[] arr = new int[7];
        for (int i = 0; i < 7; i++) {
            arr[i] = (int)Math.pow(10, i);
        }

        int result = 0;
        for (int i = 1; i < N; i++) {
            int sum = i;
            for (int a : arr) {
                if(a > i) break;
                sum += (i / a) % 10;
            }
            if (sum == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}


