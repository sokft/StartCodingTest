

    import java.util.HashMap;
    import java.util.Map;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            /*
            문제 정의: 5*5빙고판, 사회자가 계속 숫자를 부를건데, 3개의 줄이 만들어지면 빙고, 언제 외치는지?
             */
            /*
            문제 풀이
            1. 5줄까지 빙고판 -> 배열에 넣기
            2. 2차원 배열을 1개더 추가로 만들어서 flag로 조건 맞으면 빙고 추가?
            3. 빙고의 경우의 수
             - 직선 : arr[i][1] = 0; arr[1][j] = 0;
             - 대각선 : arr[0][0], arr[1][1]아니면 arr[0][4], arr[1][3]
             */
            Scanner sc = new Scanner(System.in);
            int bingo = 0;
            int[][] board = new int[5][5];
            int[] announce = new int[25];
            int[][] flag = new int[5][5];


            for (int i = 0; i < 5; i++) {
                for (int j=0; j <5; j++) {
                    board[i][j] = sc.nextInt();
                    flag[i][j] = 0;
                }
            }

            for (int i = 0; i < 25; i++) {
                announce[i] = sc.nextInt();
            }

            // 이제 사회자 말한 것들배열 인덱스 찾고 flag =1 로 만들기?
            // 사회자가 말한것, 이차원배열 계속 순회하는 것은 흠,,
            for (int i = 0; i < 25; i++) {
                for (int j = 0; j < 5; j++) {
                    for (int k =0; k < 5; k++) {
                        if(board[j][k] == announce[i]) {
                            flag[j][k] = 1;
                            bingo = checkBingo(flag);
                            if (bingo >=3) {
                                System.out.println(i+1);
                                return;
                            }
                            break;
                        }

                        //여기에 규칙 맞으면 bingo ++, 그리고 break 후 print
                        // 00 01 02 03 04, 00 10 20 30 40 면 빙고, 00 11 22 33 44 빙고,
                        
                    }
                }
            }


        }

        private static int checkBingo(int[][] flag) {
            int count = 0;

            for (int i = 0; i < 5; i++) {
                boolean bingo = true;
                for (int j = 0; j < 5; j++) {
                    if (flag[i][j] != 1) {
                        bingo = false;
                        break;
                    }
                }
                if (bingo) count++;
            }

            for (int j = 0; j < 5; j++) {
                boolean bingo = true;
                for (int i = 0; i < 5; i++) {
                    if (flag[i][j] != 1) {
                        bingo = false;
                        break;
                    }
                }
                if (bingo) count++;
            }

            boolean diagonal1 = true;
            for (int i = 0; i < 5; i++) {
                if (flag[i][i] != 1) {
                    diagonal1 = false;
                    break;
                }
            }
            if (diagonal1) count++;

            boolean diagonal2 = true;
            for (int i = 0; i < 5; i++) {
                if (flag[i][4 - i] != 1) {
                    diagonal2 = false;
                    break;
                }
            }
            if (diagonal2) count++;

            return count;
        }
    }

