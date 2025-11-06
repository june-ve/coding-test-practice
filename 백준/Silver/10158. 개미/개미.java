import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        int t = sc.nextInt();

        int timeP = t % (2 * w);
        int timeQ = t % (2 * h);

        int pMove = 1;
        int qMove = 1;
        while (timeP-- > 0) {
            if (p == w) {
                pMove = -1;
            } else if (p == 0) {
                pMove = 1;
            }
            p += pMove;
        }
        while (timeQ-- > 0) {
            if (q == h) {
                qMove = -1;
            } else if (q == 0) {
                qMove = 1;
            }
            q += qMove;
        }

        System.out.println(p + " " + q);
    }
}
