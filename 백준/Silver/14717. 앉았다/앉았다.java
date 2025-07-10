import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int card1 = scanner.nextInt();
        int card2 = scanner.nextInt();
        int myRank = calculateRank(card1,card2);
        int total = 18*17/2;

        List<Integer> deck = new ArrayList<>();
        for (int i = 1; i <= 10; i ++) {
            deck.add(i);
            deck.add(i);
        }
        deck.remove(Integer.valueOf(card1));
        deck.remove(Integer.valueOf(card2));

        //이제 카드 구성 끝 -> 이제 하나하나 반복문 돌려보면서 이기는 경우의 수 찾기

        int count = 0;
        for (int i = 0; i<17; i++ ) {
            for (int j = i+1; j<18; j++) {
                int first = deck.get(i);
                int second = deck.get(j);
                int oppositeRank = calculateRank(first, second);
                if (myRank > oppositeRank) count++;
            }
        }

        double probability = (double)count / total;
        System.out.printf("%.3f", probability);

        scanner.close();
    }
    private static int calculateRank(int card1, int card2) {
        if (card1 == card2) {
            return 10 + card1;
        } else {
            return (card1 + card2) % 10;
        }
    }
}

