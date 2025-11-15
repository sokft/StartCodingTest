import java.util.*;
public class Main {
    public static void main(String[] args) {
        /*
            1. 연속한 숫자면 안됨. -> 다 찾고 거기서 빼기?
            2. k는 자식의 수
            3. n은 깊이
        */
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        // Please write your code here.
        choose(n,k,1);
    }

    public static ArrayList<Integer> list = new ArrayList<>();


    public static void choose(int n, int k, int currNum) {
        // 깊이 끝까지 가면 print하고 return;
        if(currNum == n+1) {
            printAnswer();
            return ;
        } 

        for (int i = 0; i < k; i++) {
            boolean x = true;
            if ( list.size() >= 2) {
                if( list.get(list.size() -1) == i+1 && list.get(list.size()-2) == i+1) {
                x = false;
                }
            }
            if (x) {
            list.add(i+1);
            choose(n,k, currNum + 1);
            list.remove(list.size() - 1);
            }
        }
    }

    public static void printAnswer() {
        for (int i = 0; i < list.size(); i++) {

            System.out.print(list.get(i) + " ");
        }
        System.out.println();

    }

}