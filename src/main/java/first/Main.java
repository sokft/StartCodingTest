package first;

import java.util.*;

import java.util.*;

public class Main {
    /*
      두 명을 뺀 합이 100이 되는 경우 찾기
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int total = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        int f1 = 0, f2 = 0;
        boolean found = false;
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (total - arr[i] - arr[j] == 100) {
                    f1 = i;
                    f2 = j;
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            if (i == f1 || i == f2) continue;
            result.add(arr[i]);
        }

        Collections.sort(result);
        for (int num : result) {
            System.out.println(num);
        }
    }
}