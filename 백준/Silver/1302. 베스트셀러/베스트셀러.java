import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] soldBooks = new String[N];
        for (int i = 0; i < N; i++) {
            soldBooks[i] = sc.next();
        }
        Arrays.sort(soldBooks);

        String maxTitle = soldBooks[N - 1];
        int maxCount = 1;
        int currentCount = 1;
        for (int i = N - 2; i >= 0; i--) {
            if (!soldBooks[i].equals(soldBooks[i + 1])) {
                currentCount = 0;
            } 
            currentCount++;
            if (maxCount <= currentCount) {
                maxCount = currentCount;
                maxTitle = soldBooks[i];
            }
        }
        System.out.println(maxTitle);
    }
}
