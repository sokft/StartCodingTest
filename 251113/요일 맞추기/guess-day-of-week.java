import java.util.*;
public class Main {
    /*  
        1. m1, d1, m2, d2
        m1,d1은 월요일 -> m2,d2는 무슨 요일일까? 
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.

        String[] weeks = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int day = 0;

        if (m1 <= m2 && d1 <= d2){ 
        //1. 날짜가 m1d1 < m2d2
        while(true) {
            if(m1 == m2 && d1 == d2) {
                break;
            }

            d1++;
            day++;
            if(d1 > days[m1]) {
                m1++;
                d1 = 1;
            }
        }
        } else if (m1 >= m2 && d1 >= d2 ) {
        //2. 날짜가 m1d1 > m2d2
        while(true) {
            if(m1 == m2 && d1 == d2) {
                break;
            }

            d2++;
            day--;
            if(d2 > days[m2]) {
                m2++;
                d2 = 1;
            }
        }
        }

        //음수면 7 - 절댓값

        int weekDay = 0;
        if(day < 0) {
            weekDay = Math.abs(day);
            weekDay = weekDay % 7;
            System.out.println(weeks[7 - weekDay]);
        } else if (day >= 0) {
            weekDay = weekDay %7;
            System.out.println(weeks[weekDay]);
        }
    }
}