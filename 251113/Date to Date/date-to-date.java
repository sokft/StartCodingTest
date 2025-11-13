import java.util.Scanner;
public class Main {
    /*
        날짜 계산 프로그램
        while문
            탈출 조건 : month = m2, day = d2
            계속 m1++, d1++
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.
        int day = 1;

        int[] endOfDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        while(true) {
            if(m2 == m1 && d2 == d1) {
                break;
            }
            d1++;
            day++;
            
            if(d1 > endOfDays[m1]) {
                m1++;
                d1 = 1;
            }
        }
        System.out.println(day);
    }
}