import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0;
        int answer = 0;
        for(int i = 0; i < n; i++) {
            if(i==0 || arr[i-1] == arr[i]) {
                cnt++;
            } else if (arr[i-1] != arr[i]) {
                if(cnt > answer) answer = cnt;
                cnt = 1;
            }

        }
        if (n==1) {
                System.out.println(1);
            } else {
        System.out.println(answer);
            }
    }
}