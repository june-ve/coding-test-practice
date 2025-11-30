import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            int floor = 0;
            int ho = 0;
            if (N % H == 0) {
                floor = H;
                ho = N / H;
            } else {
                floor = N % H;
                ho = N / H + 1;
            }
            System.out.printf("%d%02d%n", floor, ho);
        }
    }
}
