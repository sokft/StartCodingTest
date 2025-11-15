import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        Stack<Integer> stack = new Stack<>();
        int num = 0;


        for (int i =0; i< n; i++) {
            String s = sc.next();
            if (s.equals("push")) {
                num = sc.nextInt();
                stack.push(num);
            } else if (s.equals("top")) {
                System.out.println(stack.peek());
            } else if (s.equals("size")) {
                System.out.println(stack.size());
            } else if (s.equals("pop")){
                System.out.println(stack.pop());
            } else if (s.equals("empty")) {
                System.out.println(stack.isEmpty() ? 1 : 0);
            }
        }
    }
}