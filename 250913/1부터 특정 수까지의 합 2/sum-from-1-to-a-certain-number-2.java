import java.util.Scanner;

public class Main {
    /*
    N에 대해서 1부터 N까지의 합을 구하기
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(sumNumber(n));

    }

    private static int sumNumber(int n) {
        if(n == 0) return 0;
        return sumNumber(n - 1) + n;
    }

    
}