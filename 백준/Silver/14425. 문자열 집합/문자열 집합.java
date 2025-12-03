import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        Set<String> S = new TreeSet<>();
        while (N-- > 0) {
            S.add(sc.next());
        }

        int count = 0;
        while (M-- > 0) {
            if (S.contains(sc.next()))
                count++;
        }
        System.out.println(count);
    }
}