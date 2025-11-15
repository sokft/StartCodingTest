import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*
        1. 3, 2 -> 1 1 1 2 1 3 -> 1, 2, 3 의 중복 조합으로 이루어짐. 
        2. n은 트리의 깊이 -> k는 자식 노드의 갯수.
        3. 1, 1 1, 2 1,3 2 1 22 23 31 32 33 이렇게 가능.
        4. 재귀함수 사용
        */


        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        // Please write your code here.
        choose(k,n,1);


    }
    public static ArrayList<Integer> answer = new ArrayList<>();

    public static void choose(int k, int n, int currNum) {
        if (currNum == n+1) {
            printAnswer();
            return;
        }

        for (int i = 0; i < k; i++) {
            answer.add(i + 1);
            choose(k, n, currNum + 1);
            answer.remove(answer.size()-1);
        }


    }
    public static void printAnswer() {
        for (int i = 0; i <answer.size(); i++) {
            System.out.print(answer.get(i) + " ");
        }
        System.out.println();
    }
}