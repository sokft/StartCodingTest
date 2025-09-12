import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        print1(n);
    }

    //재귀함수로 
    private static void print1(int n) {
        if (n == 0) return;
        for (int i = 0; i < n; i++ ){
            System.out.printf("* ");
            
        }
        System.out.println();
        print1(n - 1);
        for (int i = n; i > 0; i-- ){
            System.out.printf("* ");
            
        }
        System.out.println();
    }

}