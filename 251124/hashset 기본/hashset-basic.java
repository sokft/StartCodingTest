import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashSet<Integer> set= new HashSet<>();
        for (int i = 0; i < n; i++) {
            
            String command = sc.next();
            if (command.equals("find")) {
                int x = sc.nextInt();
                System.out.println(set.contains(x));
            } else if (command.equals("remove")) {
                int x = sc.nextInt();
                set.remove(x);
            } else if (command.equals("add")) {
                int x = sc.nextInt();
                set.add(x);
            }
        }
    }
}