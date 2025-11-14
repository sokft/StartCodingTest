import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};
        int x = 0;
        int y = 0;
        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();
            if (direction == 'E') {
                x = x + distance * dx[0];
            } else if (direction == 'W') {
                x= x + distance *  dx[2];
            } else if (direction == 'S') {
                y= y + distance *  dy[1];
            } else {
                y = y + distance *  dy[3];
            }

        }
        System.out.print(x + " " + y);
    }
}