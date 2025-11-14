import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] person = new int[n+1];
        int[] penalizedPerson = new int[m];
        int answer = -1;
        for (int i = 0; i < m; i++) {
            penalizedPerson[i] = sc.nextInt();
            person[penalizedPerson[i]] += 1;
            if(person[penalizedPerson[i]] == k) {
                answer = penalizedPerson[i];
                break;
            }
        }
        System.out.println(answer);
      
    }
}