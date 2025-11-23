import java.util.*;
import java.util.Iterator;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        TreeMap<Integer, Integer> tree = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.equals("add")) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                tree.put(a, b);
            } else if (s.equals("find")) {
                int a = sc.nextInt();
                if(tree.containsKey(a)) {
                    System.out.println(tree.get(a));
                } else {
                    System.out.println("None");
                }
            } else if (s.equals("print_list")) {
                Iterator<Entry<Integer, Integer>> it = tree.entrySet().iterator();
                
                if(!it.hasNext()) {
                    System.out.println("None"); 
                    continue;
                    }
                while(it.hasNext()) {
                    Entry<Integer,Integer> entry = it.next();
                    System.out.print(entry.getValue() + " ");
                }
                System.out.println();
            } else if (s.equals("remove")) {
                int a = sc.nextInt();
                tree.remove(a);
            }
        } 
    }
}