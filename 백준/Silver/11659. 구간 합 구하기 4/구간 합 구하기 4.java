import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] accumulatedNums = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            accumulatedNums[i] += sc.nextInt() + accumulatedNums[i - 1];
        }

        while (M-- > 0) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.println(accumulatedNums[j] - accumulatedNums[i - 1]);
        }
    }
}