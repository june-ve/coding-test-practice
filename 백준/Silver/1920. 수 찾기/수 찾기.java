import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);

        int M = sc.nextInt();
        while (M-- > 0) {
            int numToFind = sc.nextInt();
            boolean exists = contains(A, numToFind);
            System.out.println(exists ? 1 : 0);
        }
    }

    private static boolean contains(int[] A, int numToFind) {
        int l = 0;
        int r = A.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (A[m] < numToFind) {
                l = m + 1;
            } else if (A[m] > numToFind) {
                r = m - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}