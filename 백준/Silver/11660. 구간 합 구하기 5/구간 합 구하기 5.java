import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] accRowNums = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                accRowNums[i][j] += sc.nextInt() + accRowNums[i][j - 1];
            }
        }

        while (M-- > 0) {
            int x1 = sc.nextInt(), y1 = sc.nextInt();
            int x2 = sc.nextInt(), y2 = sc.nextInt();

            int ans = 0;
            for (int i = x1; i <= x2; i++) {
                ans += (accRowNums[i][y2] - accRowNums[i][y1 - 1]);
            }
            System.out.println(ans);
        }
    }
}