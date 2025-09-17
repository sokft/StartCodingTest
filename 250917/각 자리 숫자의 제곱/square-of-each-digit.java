import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(sumNum(n));

    }

    private static int sumNum(int n) {
        if (n < 10) return n*n;
        return sumNum(n / 10) + (n % 10)*(n % 10);

    }
}