import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        List<Integer> list = new ArrayList<>();
        int num = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();

            if (s.equals("push_back")) {
                num = sc.nextInt();

                list.add(num);
            } else if ( s.equals("get")) {
                num = sc.nextInt();
                int getNum = list.get(num-1);
                System.out.println(getNum);

            } else if (s.equals("size")) {
                int size = list.size();
                System.out.println(size);
            } else if(s.equals("pop_back")) {
                list.remove(list.size() - 1);
            }
            
        }
    
    
    }
}