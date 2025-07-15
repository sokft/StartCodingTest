

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        문제 정의: 컵 3개를 일렬로 엎어놓고, 1번 컵에 공 넣음. 그리고 컵의 위치 교환 -> 최종 공의 위치는?
         */

        /*
        문제 풀이
        1. 컵은 3개이기 때문에 key:value해시값? 1:1. 2:0, 3:0
        2. 그리고 다음 줄에 교환 위치 있음 -> 반복문 돌리면서 if인덱스에 1이 있으면 둘을 교환?

         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<Integer, Boolean> map = new HashMap<>();
        map.put(1, true);
        map.put(2, false);
        map.put(3, false);

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            boolean temp = map.get(x);
            map.put(x, map.get(y));
            map.put(y, temp);
        }
        for (int i = 1; i <= 3; i++) {
            if (map.get(i)) {
                System.out.println(i);
                break;
            }
        }



    }
}

