import java.util.Scanner;
public class Main {
    public static final int max = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            
        
        }
        // Please write your code here.
        int result = max;
         //거리의 차 * 원소의 값의 합
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n;j++) {
                sum += a[j] * Math.abs(i -j);
                // System.out.println(sum);
            }
            result = Math.min(sum,result);
            sum = 0;
         }

        System.out.println(result);


    }


}