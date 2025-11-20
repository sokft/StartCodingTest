import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] queries = new int[m];
        for (int i = 0; i < m; i++) {
            queries[i] = sc.nextInt();
        }
        // Please write your code here.

        // arr[i]를 다 맵으로 묶기
        Map<Integer,Integer> map = new HashMap<>();
        for(int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (int i = 0; i < m; i++) {
            int result =  map.getOrDefault(queries[i], 0);

            System.out.print(result + " ");  
        }
    }
}