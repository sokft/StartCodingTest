import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s = sc.next().charAt(0);
        // Please write your code here.
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};
        
       int  dir = 3;
        if(s == 'L') {
            dir = (dir-1)%4;
        } else if (s == 'R') {
            dir = (dir+1)%4;
        }

        int nx = dx[dir];
        int ny = dy[dir];
        System.out.print(nx + " " + ny);
    }
}