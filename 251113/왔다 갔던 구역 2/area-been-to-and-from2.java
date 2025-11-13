import java.util.*;
public class Main {

    /*
        1. -1000 ~ 1000 까지의 수가 있을 수 있음
        2. R이면 

    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[2001];

        int point = 1000;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            // Please write your code here.
            if (dir == 'R') {
                for (int j = point; j < point+x; j++) {
                    arr[j] += 1;
                }
                point += x;
            } else if(dir == 'L') {
                for (int j = point -1; j >= point -x; j--) {
                    arr[j] += 1;
                }
                point -= x;
            }
        }

        long answer = Arrays.stream(arr).filter(x -> x >=2).count();
        System.out.println(answer);
    }
}