import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main (String[] args) {
        /*
        문제 파악
        1. 1~10까지 적힌 카드 2장씩 총 20장
        2. 땡 > 끗
            ex - 1 1이면 2땡~10땡빼고 모두 이김 -> 확률: 18*17/2-9/18*17/2
        3. 0.000 이렇게 셋째자리까지 반올림해서 출력 해야함
         */

        /*
        문제 풀이
        1. 분모는 무조건 18*17/2이고, 분자가 애매함.
        2. 땡: 입력받은 수 에서 같다면 10 - 입력받은 수 만큼을 18*17/2에서 빼면 됨
        3. 끗: 입렫받은 수가 다르다면 합쳐 -> 10보다 크면 -10, 10보다 작으면 그 수를 바탕으로 생각
            이때 끗은 짝수면 16 홀수면 20개의 경우의 수가 있음
            ex - 3끗 -> 0,1,2끗 이기는데 16*2 + 20개의 경우의 수 이김
         */
        Scanner scanner = new Scanner(System.in);
        
        int myFirstCard = scanner.nextInt();
        int mySecondCard = scanner.nextInt();
      int myRank = calculateRank(myFirstCard, mySecondCard);
        
        List<Integer> deck = new ArrayList<>();
        for (int card = 1; card <= 10; card++) {
            deck.add(card);
            deck.add(card);
        }
        
        deck.remove(Integer.valueOf(myFirstCard));
        deck.remove(Integer.valueOf(mySecondCard));
        
        int totalCombos = 0;
        int winCount    = 0;
        int n = deck.size(); // 항상 18
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int oppFirstCard  = deck.get(i);
                int oppSecondCard = deck.get(j);
                
                int opponentRank = calculateRank(oppFirstCard, oppSecondCard);
                
                if (myRank > opponentRank) {
                    winCount++;
                }
                
                totalCombos++;
            }
        }
        
        double probability = (double) winCount / totalCombos;
        System.out.printf("%.3f\n", probability);
        
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