import java.util.Scanner;

public class Main {
    public static final int MAX_T = 1000001;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();


        int[] posA = new int[MAX_T]; 
        int[] posB = new int[MAX_T]; 


        int currentTimeA = 1;
        int currentPosA = 0; 
        for (int i = 0; i < n; i++) {
            char dir = sc.next().charAt(0);
            int time = sc.nextInt();

            int move = (dir == 'R') ? 1 : -1;


            for (int t = 0; t < time; t++) {
                currentPosA += move;
                posA[currentTimeA] = currentPosA;
                currentTimeA++; 
            }
        }
        

        int totalTime = currentTimeA - 1; 


        int currentTimeB = 1; 
        int currentPosB = 0;  
        for (int i = 0; i < m; i++) {
            char dir = sc.next().charAt(0);
            int time = sc.nextInt();

            int move = (dir == 'R') ? 1 : -1;


            for (int t = 0; t < time; t++) {
                currentPosB += move;
                posB[currentTimeB] = currentPosB;
                currentTimeB++; 
            }
        }


        int answer = -1;
        for (int t = 1; t <= totalTime; t++) {

            if (posA[t] == posB[t]) {
                answer = t; 
                break;
            }
        }

        System.out.println(answer);
    }
}