import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sCode = sc.next();
        char mPoint = sc.next().charAt(0);
        int time = sc.nextInt();
        // Please write your code here.
        secretCode s = new secretCode(sCode, mPoint, time);
        s.printCode();
    }

   
}

class secretCode {
        String secretCode;
        char place;
        int time;
        public secretCode(String secretCode, char place, int time) {
            this.secretCode = secretCode;
            this.place = place;
            this.time = time;
        }

        public void printCode() {
            System.out.println("secret code : " + this.secretCode);
            System.out.println("meeting point : " + this.place);
            System.out.println("time : " + this.time);

        }
    }