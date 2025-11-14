import java.util.Scanner;


public class Main {
    public static final int max = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }
        // Please write your code here.
        int result = max;
        for(int i = 0; i< n; i++) {
            for(int j = i+1; j< n; j++) {
                int remainingSum = totalSum - arr[i] -arr[j];
                int diff = Math.abs(remainingSum - s);

                result = Math.min(diff,result);
            }
        }
        System.out.println(result);
    }
}