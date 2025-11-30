import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String input = sc.hasNext() ? sc.next() : "";
        boolean[][] leftRight = new boolean[N][N];
        boolean[][] upDown = new boolean[N][N];

        int currentI = 0, currentJ = 0;
        for (int t = 0; t < input.length(); t++) {
            if (input.charAt(t) == 'U' && currentI > 0 ) {
                upDown[currentI][currentJ] = true;
                currentI--;
                upDown[currentI][currentJ] = true;
            } else if (input.charAt(t) == 'D' && currentI < N - 1) {
                upDown[currentI][currentJ] = true;
                currentI++;
                upDown[currentI][currentJ] = true;
            } else if (input.charAt(t) == 'L' && currentJ > 0) {
                leftRight[currentI][currentJ] = true;
                currentJ--;
                leftRight[currentI][currentJ] = true;
            } else if (input.charAt(t) == 'R' && currentJ < N - 1) {
                leftRight[currentI][currentJ] = true;
                currentJ++;
                leftRight[currentI][currentJ] = true;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (leftRight[i][j]) {
                    if (upDown[i][j]) System.out.print('+');
                    else System.out.print('-');
                } else if (upDown[i][j]) {
                    System.out.print('|');
                } else {
                    System.out.print('.');
                }
            }
            System.out.println();
        }
    }
}
