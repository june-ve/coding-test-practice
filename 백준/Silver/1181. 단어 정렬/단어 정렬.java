import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] words = new String[N];
        for (int i = 0; i < N; i++) {
            words[i] = sc.next();
        }

        Arrays.sort(words, (o1, o2) -> {
            if (o1.length() == o2.length())
                return o1.compareTo(o2);
            return o1.length() - o2.length();
        });

        words = Arrays.stream(words).distinct().toArray(String[]::new);
        
        for (String word : words) {
            System.out.println(word);
        }
    }
}
