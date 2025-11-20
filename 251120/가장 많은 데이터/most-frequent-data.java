import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        // Please write your code here.
        Map<String, Integer> map = new HashMap<>();
        for (String i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int max = 0;
        for( Map.Entry<String, Integer> entry: map.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        System.out.println(max);
    }
}