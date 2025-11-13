import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[201][201];
        for (int i = 0; i < n; i++) {
            if(i%2 == 0) {
            int x1 = sc.nextInt()+100;
            int y1 = sc.nextInt()+100;
            int x2 = sc.nextInt()+100;
            int y2 = sc.nextInt()+100;
            
            for(int j = x1; j < x2; j++){
                for(int k = y1; k<y2;k++) {
                    arr[j][k] = 0;
                }
                }
            } else {

            
            int x1 = sc.nextInt()+100;
            int y1 = sc.nextInt()+100;
            int x2 = sc.nextInt()+100;
            int y2 = sc.nextInt()+100;
            
            for(int j = x1; j < x2; j++){
                for(int k = y1; k<y2;k++) {
                    arr[j][k] += 1;
                }
             }
            }
        }
        // Please write your code here.
        int answer = 0;
        for(int[] i : arr) {
            for (int j : i) {
                if (j >= 1) answer++;
            }
        }
        
        System.out.println(answer);
    }
}