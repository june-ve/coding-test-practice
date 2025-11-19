import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        boolean[] exist = new boolean[1_000_001];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
            exist[nums[i]] = true;
        }
        int X = sc.nextInt();

        int ans = 0;
        for (int i = 0; i < N; i++) {
            int pairValue = X - nums[i];
            if ((1 <= pairValue) && (pairValue <= 1_000_000) && exist[pairValue])
                ans++;
        }

        System.out.println(ans / 2);
    }
}
