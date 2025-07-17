

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /*
      문제 정의: 살 수 있다면 주식 계속 삼.
      준현이는 살 수 있으면 다 삼
      성민이는 3일 연속으로 상승 -> 다 팔기, 3일연속 하락 -> 다 사기,
      14일동안의 자산 누가 더 높은지
       */

        /*
        문제풀이
        1. 배열에 주가 전부 다 넣기
        2. 준현이의 경우 계산 함수
        3. 성민이의 자산경우 계산 함수
        4. 그래서 가격비교하고 출력
         */
        Scanner sc = new Scanner(System.in);

        int initial = sc.nextInt();
        int[] arr = new int[14];
        for (int i = 0; i < 14; i++) {
            arr[i] = sc.nextInt();
        }
        int J = jMoney(arr,initial);
        int S = sMoney(arr, initial);

        if (J == S) {
            System.out.println("SAMESAME");
        } else if(J > S) {
            System.out.println("BNP");
        } else {
            System.out.println("TIMING");
        }

    }

    private static int jMoney(int[] arr, int money) {
        int stock = 0;
        //만약 100, 10 -> 10주, 15, (20, 20, 6) -> 0, 0, 1주
        /*
        그니까 if(money > arr[i]) -> stock = money /arr[i], money= money-arr[i]*stock
        money가  money를 주가로 나누면 stock,
         */
        for(int i = 0; i < arr.length; i++) {
            if (money >= arr[i]) {
                int buy = money/arr[i];
                stock += buy;
                money = money - arr[i]*buy;
            } else {
                continue;
            }
        }
        return money + stock* arr[13];
    }

    private static int sMoney(int[] arr, int money) {
        int stock = 0;
        /*
        10, 20, 23, 34, 55, 30, 22, 19
        3일 하락 -> 똑같이 buy
        3일 상승 -> sell 전부 -> money += stock*주가
         */

        for (int i =3; i < arr.length; i++) {
            //하락할때
            if(arr[i-3] > arr[i-2] && arr[i-2] > arr[i-1]) {
                int buy = money/arr[i];
                stock += buy;
                money -= buy*arr[i];
            }
            //상승할때
            else if(arr[i-3] < arr[i-2] && arr[i-2] < arr[i-1]) {
                money += stock*arr[i];
                stock = 0;
            }

        }


        return money + stock * arr[13];
    }


}

