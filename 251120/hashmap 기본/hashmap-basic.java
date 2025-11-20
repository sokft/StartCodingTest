import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i< n; i++) {
            String cmd = sc.next();
            if(cmd.equals("add")) {
                int key = sc.nextInt();
                int value = sc.nextInt();
                map.put(key, value);
            } else if (cmd.equals("find")) {
                int key = sc.nextInt();
                if(map.containsKey(key)) {
                    System.out.println(map.get(key));
                } else {
                    System.out.println("None");
                }
            } else if (cmd.equals("remove")) {
                int key = sc.nextInt();
                map.remove(key);
            }
        }
    }
}