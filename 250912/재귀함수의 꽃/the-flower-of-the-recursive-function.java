import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursive1(n);
        recursive2(1, n);

    }


    //54321 재귀 
    private static void recursive1(int i) {
        if ( i <= 0) return;
        System.out.printf("%d ", i);
        recursive1(i - 1);
    
    }

    // 12345 재귀
        private static void recursive2(int current, int max) {
        if (current > max) {
            return;
        }
        System.out.printf("%d ", current);
        recursive2(current + 1, max); 
    }

}