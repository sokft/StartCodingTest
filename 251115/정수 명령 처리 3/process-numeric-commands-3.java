import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int num = 0;
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.equals("push_back")) {
                num = sc.nextInt();
                dq.addLast(num);
            } else if(s.equals("push_front")) {
                num = sc.nextInt();
                dq.addFirst(num);
            } else if(s.equals("pop_front")) {
                System.out.println(dq.pollFirst());
            } else if(s.equals("pop_back")) {
                System.out.println(dq.pollLast());
            } else if ( s.equals("front")) {
                System.out.println(dq.peekFirst());
            } else if ( s.equals("back")) {
                System.out.println(dq.peekLast());
            } else if(s.equals("size")) {
                System.out.println(dq.size());
            } else if(s.equals("empty")) {
                System.out.println(dq.isEmpty() ? 1 : 0);
            }
    
        }
    }
}