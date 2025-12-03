import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.next();
        }
        Arrays.sort(S);

        int count = 0;
        while (M-- > 0) {
            if (contains(S, sc.next())) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean contains(String[] S, String wordToFind) {
        int l = 0;
        int r = S.length - 1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (S[m].compareTo(wordToFind) > 0) {
                r = m - 1;
            } else if (S[m].compareTo(wordToFind) < 0) {
                l = m + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}