

    import java.util.*;

    public class Main {
        static int maxResult = Integer.MIN_VALUE;
        static int minResult = Integer.MAX_VALUE;

        public static void main(String[] args) {
            /*
            1. N개로 이루어진 수열 -> 수와 수 사이 끼어넣을 수 있는 N-1개 연산자(+,-,*,/) 주어짐
            2. 연산자 우선순위를 지키지 않는다, 나눗셈은 몫만 취한다.
            3. 예시로 1 + 2 +3 -4 * 5 / 6 = 1 왜냐하면 앞에서붵 괄호를 치면서 연산을 하는 것임
            4. 첫째 줄에 수의 갯수, 둘째는 숫자, 셋째줄에는 + - * / 순서로.
             */

            /*
            문제 풀이 - 백트래킹
            1. 일단 다 가져와. 내 생각에는, 사칙연산 배열을 선언하고, 0000이 될떄까지 계속 쓰기.
            2. 함수를 선언해서 계산하기 -> 여기서 계산한 값들을 배열에 저장하고 최댓값, 최솟값 뽑아서 print
             */

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] numbers = new int[n];
            for (int i = 0; i < n; i++) {
                numbers[i] = sc.nextInt();
            }

            int[] operations = new int[4];
            for (int i = 0; i < 4; i++) {
                operations[i] = sc.nextInt();
            }

            backtrack(numbers, operations, 0, numbers[0]);

            System.out.println(maxResult);
            System.out.println(minResult);

        }

        private static void backtrack(int[] numbers, int[] operations, int index, int currentResult) {
            if(index == numbers.length - 1) {
                maxResult = Math.max(maxResult, currentResult);
                minResult = Math.min(minResult, currentResult);
                return;
            }

            for (int i =0; i<4; i++) {
                if(operations[i] > 0) {

                    operations[i]--;

                    int nextResult = calculate(currentResult,numbers[index +1], i);

                    backtrack(numbers, operations, index +1 , nextResult);

                    operations[i]++;
                }

            }


        }
        private static int calculate(int a, int b, int operator) {
            switch(operator) {
                case 0: return a + b;
                case 1: return a - b;
                case 2: return a * b;
                case 3:
                    if (a < 0) {
                        return -(-a / b);
                    }
                    return a / b;
                default: return 0;
            }
        }





    }



