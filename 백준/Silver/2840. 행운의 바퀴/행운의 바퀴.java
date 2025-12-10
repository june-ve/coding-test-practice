import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        boolean isInvalid = false;
        char[] wheel = new char[N];
        for (int i = 0; i < N; i++) {
            wheel[i] = '?';
        }

        int currentIndex = N - 1;
        while (K-- > 0) {
            int S = sc.nextInt();
            char ch = sc.next().charAt(0);
            int step = S % N;
            currentIndex -= step;
            if (currentIndex < 0) {
                currentIndex += N;
            }

            if (wheel[currentIndex] != '?' && wheel[currentIndex] != ch) {
                isInvalid = true;
                break;
            }
            wheel[currentIndex] = ch;
        }

        boolean[] duplicateCheck = new boolean[26];
        for (char ch: wheel) {
            if (ch != '?') {
                int idx = ch - 'A';
                if (duplicateCheck[idx]) {
                    isInvalid = true;
                    break;
                }
                duplicateCheck[idx] = true;
            }
        }

        if (isInvalid) {
            System.out.println("!");
        } else {
            int count = 0;
            for (int i = currentIndex; count < N; i++) {
                System.out.print(wheel[currentIndex++]);
                count++;
                if (currentIndex == N) {
                    currentIndex = 0;
                }
            }
        }
    }
}